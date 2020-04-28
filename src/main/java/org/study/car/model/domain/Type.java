package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "t_type")
public class Type extends BaseEntity {

    /**
     * 保养维修类别编码
     */
    @Column(name = "type_code")
    private String typeCode;

    /**
     * 保养维修类别名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;
}