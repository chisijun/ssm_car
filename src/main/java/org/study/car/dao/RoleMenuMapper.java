package org.study.car.dao;

import org.study.car.model.domain.RoleMenu;
import org.study.car.model.vo.MenuVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMenuMapper extends Mapper<RoleMenu> {

    /**
     * query menu list by role id
     *
     * @param roleId the role id
     *
     * @return the list.
     */
    List<MenuVo> queryMenuListByRoleId(Long roleId);
}