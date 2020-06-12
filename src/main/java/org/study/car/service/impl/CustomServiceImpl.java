package org.study.car.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.CustomMapper;
import org.study.car.model.domain.Custom;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CustomQueryDto;
import org.study.car.service.CustomService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:16
 * @Description: the class custom service impl
 */
@Service("customService")
public class CustomServiceImpl extends BaseService<Custom> implements CustomService {

    @Resource
    private CustomMapper customMapper;

    /**
     * 保存客户信息
     *
     * @param login  当前登录者
     * @param custom 客户信息
     * @return the int.
     */
    @Override
    public Integer save(User login, Custom custom) {

        custom.setUpdateInfo(login);

        if (custom.isNew()) {

            return customMapper.insertSelective(custom);
        }

        return customMapper.updateByPrimaryKeySelective(custom);
    }

    /**
     * 查询客户列表 - 分页
     *
     * @param customQueryDto the custom query dto
     *
     * @return the list.
     */
    @Override
    public List<Custom> queryListWithPage(CustomQueryDto customQueryDto) {

        PageHelper.startPage(customQueryDto.getPageNum(), customQueryDto.getPageSize());

        return customMapper.queryListWithPage(customQueryDto);
    }

    /**
     * 根据Id客户信息
     *
     * @param id the id
     * @return the int.
     */
    @Override
    public Integer deleteById(Long id) {

        return customMapper.deleteByPrimaryKey(id);
    }
}
