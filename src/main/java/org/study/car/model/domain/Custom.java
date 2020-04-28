package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "t_custom")
public class Custom extends BaseEntity {

    /**
     * 姓名
     */
    private String name;

    /**
     * 住址
     */
    private String address;

    /**
     * 手机号
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 年龄 0-女 1-男
     */
    private Integer sex;

    /**
     * 身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

}