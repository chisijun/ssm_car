package org.study.car.service;

import com.github.pagehelper.PageInfo;
import org.study.car.base.IService;
import org.study.car.model.domain.Role;
import org.study.car.model.dto.RoleQueryDto;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 15:12
 * @Description:
 */
public interface RoleService extends IService<Role> {

    /**
     * query role list with page
     *
     * @param roleQueryDto  the role query dto
     *
     * @return  the page info.
     */
    PageInfo queryRoleListWithPage(RoleQueryDto roleQueryDto);

    /**
     * delete by id
     *
     * @param id    the id
     *
     * @return  the int.
     */
    Integer deleteById(Long id);
}
