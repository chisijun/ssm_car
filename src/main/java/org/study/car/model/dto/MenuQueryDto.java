package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 13:22
 * @Description:
 */
@Data
public class MenuQueryDto extends BaseQuery {

    /**
     * 菜单名称
     */
    private String menuName;
}
