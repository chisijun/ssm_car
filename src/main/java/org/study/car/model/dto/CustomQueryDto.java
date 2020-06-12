package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 11:51
 * @Description:
 */
@Data
public class CustomQueryDto extends BaseQuery {

    /**
     * 姓名
     */
    private String name;

}
