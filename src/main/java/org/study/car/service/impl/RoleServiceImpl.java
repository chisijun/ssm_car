package org.study.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.RoleMapper;
import org.study.car.model.domain.Role;
import org.study.car.model.domain.User;
import org.study.car.model.dto.RoleQueryDto;
import org.study.car.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 15:12
 * @Description:
 */
@Service("roleService")
public class RoleServiceImpl extends BaseService<Role> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    /**
     * query role list with page
     *
     * @param roleQueryDto the role query dto
     *
     * @return the page info.
     */
    @Override
    public PageInfo queryRoleListWithPage(RoleQueryDto roleQueryDto) {

        PageHelper.startPage(roleQueryDto.getPageNum(), roleQueryDto.getPageSize());

        List<Role> roleList = roleMapper.queryRoleListWithPage(roleQueryDto);

        return new PageInfo<>(roleList);
    }

    /**
     * delete by id
     *
     * @param id the id
     * @return the int.
     */
    @Override
    public Integer deleteById(Long id) {

        return roleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 保存角色信息
     *
     * @param login 当前登录者
     * @param role  角色信息
     * @return the int
     */
    @Override
    public Integer save(User login, Role role) {
        return null;
    }
}
