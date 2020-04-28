package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "t_record")
public class Record extends BaseEntity {

    /**
     * 汽车ID
     */
    @Column(name = "car_id")
    private String carId;

    /**
     * 工时
     */
    @Column(name = "man_hour")
    private Integer manHour;

    /**
     * 工时单价
     */
    @Column(name = "hour_price")
    private BigDecimal hourPrice;

    /**
     * 工时总价
     */
    @Column(name = "hour_total")
    private BigDecimal hourTotal;

    /**
     * 零件数量合计
     */
    @Column(name = "stock_total")
    private Integer stockTotal;

    /**
     * 费用合计
     */
    @Column(name = "before_total")
    private BigDecimal beforeTotal;

    /**
     * 减免费用
     */
    @Column(name = "sub_total")
    private BigDecimal subTotal;

    /**
     * 缴纳合计
     */
    @Column(name = "after_total")
    private BigDecimal afterTotal;

    /**
     * 维修人ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 维修人姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 工单状态 1-售后提交工单 2-派工 3-领料 4-结算
     */
    private Integer stat;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}