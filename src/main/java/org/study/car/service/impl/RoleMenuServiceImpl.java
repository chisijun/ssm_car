package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.RoleMenuMapper;
import org.study.car.model.domain.RoleMenu;
import org.study.car.model.vo.MenuVo;
import org.study.car.service.RoleMenuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 11:52
 * @Description:
 */
@Service
public class RoleMenuServiceImpl extends BaseService<RoleMenu> implements RoleMenuService {

    @Resource
    private RoleMenuMapper roleMenuMapper;

    /**
     * query menu list by role id
     *
     * @param roleId the role id
     *
     * @return the list.
     */
    @Override
    public List<MenuVo> queryMenuListByRoleId(Long roleId) {

        return roleMenuMapper.queryMenuListByRoleId(roleId);
    }
}
