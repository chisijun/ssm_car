package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.RoleMenu;
import org.study.car.model.vo.MenuVo;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 11:52
 * @Description:
 */
public interface RoleMenuService extends IService<RoleMenu> {

    /**
     * query menu list by role id
     *
     * @param roleId    the role id
     *
     * @return  the list.
     */
    List<MenuVo> queryMenuListByRoleId(Long roleId);
}
