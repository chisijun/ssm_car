package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "t_part")
public class Part extends BaseEntity {

    /**
     * 名称
     */
    private String name;

    /**
     * 价格 单位-元保留两位小数
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer stock;

    /**
     * 规格
     */
    private String standard;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}