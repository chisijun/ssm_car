/**  
 * @Title: UserServiceImpl.java
 * @Package org.study.heat.service.impl
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
package org.study.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.RoleUserMapper;
import org.study.car.dao.UserMapper;
import org.study.car.model.domain.RoleUser;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CheckLoginNameDto;
import org.study.car.model.dto.ModifyPwdDto;
import org.study.car.model.dto.UserQueryDto;
import org.study.car.model.enums.UserTypeEnum;
import org.study.car.model.vo.UserVo;
import org.study.car.service.UserService;
import org.study.car.utils.MD5;
import org.study.car.utils.PublicUtil;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: UserServiceImpl 
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2019年5月16日
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

	@Resource
	private UserMapper userMapper;
	@Resource
	private RoleUserMapper roleUserMapper;

	
	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#selectUserById(java.lang.Integer)
	 */
	@Override
	public User selectUserById(Long userId) {
		// TODO Auto-generated method stub
		
		return userMapper.selectByUserId(userId);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String loginName, String password) throws Exception {
		// TODO Auto-generated method stub
		if (loginName == null || password == null) {
            throw new RuntimeException("参数传递异常");
        }

        if (StringUtils.isBlank(loginName)) {
            throw new RuntimeException("请输入用户名！");
        }

        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("请输入密码！");
        }

        // 密码加密 
        /** 
         * 通过手机号码校验 
         * */
        password = MD5.getMd5().getMD5ofStr(password);
        User user = userMapper.selectByLoginName(loginName);

        if (user== null) {
            throw new RuntimeException("用户名不存在.");
        }
        
        System.out.println("user = " + user);
        
        System.out.println("password = " + password);
        System.out.println("pwd = " + user.getLoginPwd());
        if (!password.equals(user.getLoginPwd())) {
        	throw new RuntimeException("密码错误.");
        }
        
        return user;
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#saveUser(org.study.heat.pojo.User)
	 */
	@Override
	public Integer saveUser(User user, User login) {
		// TODO Auto-generated method stub
		
		user.setUpdateInfo(login);
		
		if (user.isNew()) {

			User userQuery = userMapper.selectByPrimaryKey(user.getId());
			if (PublicUtil.isEmpty(userQuery)) {
				throw new RuntimeException("用户不存在.");
			}

			// 校验手机号是否重复

			// 校验登录名是否重复

			// 校验是否有更新角色

			String password = MD5.getMd5().getMD5ofStr("123456");
			user.setType(UserTypeEnum.USER.getType());
			user.setLoginPwd(password);
			
			return userMapper.insertSelective(user);
		} else {
			
			userMapper.updateByPrimaryKeySelective(user);

			RoleUser roleUser = new RoleUser();
			roleUser.setRoleId(user.getRoleId());

			return roleUserMapper.insertSelective(roleUser);
		}
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#queryUserListWithPage(org.study.heat.dto.UserQueryDto)
	 */
	@Override
	public PageInfo queryUserListWithPage(UserQueryDto userQueryDto) {
		// TODO Auto-generated method stub
		userQueryDto.setType(UserTypeEnum.USER.getType());
		
		PageHelper.startPage(userQueryDto.getPageNum(), userQueryDto.getPageSize());
		List<UserVo> userList = userMapper.queryUserListWithPage(userQueryDto);
		
		return new PageInfo<>(userList);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#deleteUserById(java.lang.Long)
	 */
	@Override
	public Integer deleteUserById(Long id) {
		// TODO Auto-generated method stub

		return userMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see org.study.heat.service.UserService#modifyPwd(org.study.heat.dto.ModifyPwdDto)
	 */
	@Override
	public Integer modifyPwd(ModifyPwdDto modifyPwdDto, User login) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(modifyPwdDto.getId());
		if (PublicUtil.isEmpty(user)) {
			throw new RuntimeException("用户不存在");
		}
		
		if (!modifyPwdDto.getPassword().equals(modifyPwdDto.getConfirmPwd())) {
			throw new RuntimeException("两次密码不一致");
		}
		
		String password = MD5.getMd5().getMD5ofStr(modifyPwdDto.getPassword());
		
		user = new User();
		user.setUpdateInfo(login);
		user.setId(modifyPwdDto.getId());
		user.setLoginPwd(password);
		
		return userMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 校验登录名是否位置
	 *
	 * @param checkLoginNameDto the check login name dto
	 *
	 * @return the boolean
	 * true登录名唯一 false-登录名不唯一
	 */
	@Override
	public boolean checkLoginName(CheckLoginNameDto checkLoginNameDto) {

		Long id = checkLoginNameDto.getUserId();
		String loginName = checkLoginNameDto.getLoginName();

		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("loginName", loginName);
		if (id != null) {
			criteria.andNotEqualTo("id", id);
		}

		int result = selectCountByExample(example);

		return result < 1;
	}

}
