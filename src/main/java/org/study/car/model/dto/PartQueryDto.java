package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 13:49
 * @Description:
 */
@Data
public class PartQueryDto extends BaseQuery {

    /**
     * 名称
     */
    private String name;

}
