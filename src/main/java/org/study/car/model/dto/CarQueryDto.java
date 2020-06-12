package org.study.car.model.dto;

import lombok.Data;
import org.study.car.base.BaseQuery;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-08 11:47
 * @Description:
 */
@Data
public class CarQueryDto extends BaseQuery {

    /**
     * 车架号
     */
    private String vinNo;

    /**
     * 车牌号
     */
    private String plateNo;
}
