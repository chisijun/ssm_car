package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "t_item")
public class Item extends BaseEntity {

    /**
     * 保养项目编码
     */
    @Column(name = "item_code")
    private String itemCode;

    /**
     * 保养项目名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}