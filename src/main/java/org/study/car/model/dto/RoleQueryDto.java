package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 15:15
 * @Description:
 */
@Data
public class RoleQueryDto extends BaseQuery {

    /**
     * 角色名称
     */
    private String roleName;

}
