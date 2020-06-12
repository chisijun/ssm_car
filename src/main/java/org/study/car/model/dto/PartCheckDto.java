package org.study.car.model.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 13:56
 * @Description:
 */
@Data
public class PartCheckDto {

    /**
     * 零部件ID
     */
    private Long partId;

    /**
     * 零部件价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer stock;

}
