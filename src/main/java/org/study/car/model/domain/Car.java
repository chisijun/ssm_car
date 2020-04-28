package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "t_car")
public class Car extends BaseEntity {

    /**
     * 车架号
     */
    @Column(name = "vin_no")
    private String vinNo;

    /**
     * 颜色
     */
    private String color;

    /**
     * 型号
     */
    private String model;

    /**
     * 厂家
     */
    private String factory;

    /**
     * 车牌号
     */
    @Column(name = "plate_no")
    private String plateNo;

    /**
     * 车主ID
     */
    @Column(name = "custom_id")
    private Long customId;

    /**
     * 卖出日期
     */
    @Column(name = "sell_time")
    private String sellTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}