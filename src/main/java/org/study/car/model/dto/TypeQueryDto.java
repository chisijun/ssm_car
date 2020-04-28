package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:54
 * @Description: the class type query dto
 */
@Data
public class TypeQueryDto extends BaseQuery {

    /**
     * 类型编码
     */
    private String typeCode;

    /**
     * 类型名称
     */
    private String typeName;
}
