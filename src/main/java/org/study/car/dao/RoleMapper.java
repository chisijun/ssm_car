package org.study.car.dao;

import org.study.car.model.domain.Role;
import org.study.car.model.dto.RoleQueryDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMapper extends Mapper<Role> {

    /**
     * query role list with page
     *
     * @param roleQueryDto the role query dto
     *
     * @return the page info.
     */
    List<Role> queryRoleListWithPage(RoleQueryDto roleQueryDto);
}