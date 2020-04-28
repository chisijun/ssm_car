package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "t_record_item")
public class RecordItem extends BaseEntity {

    /**
     * 维修单ID
     */
    @Column(name = "record_id")
    private Long recordId;

    /**
     * 维修项ID
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 零件ID
     */
    @Column(name = "part_id")
    private Long partId;

    /**
     * 数量
     */
    private Integer stock;

    /**
     * 单价
     */
    @Column(name = "before_price")
    private BigDecimal beforePrice;

    /**
     * 减免
     */
    @Column(name = "sub_price")
    private BigDecimal subPrice;

    /**
     * 实际价格
     */
    @Column(name = "after_price")
    private BigDecimal afterPrice;

    /**
     * 合计
     */
    private BigDecimal total;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}