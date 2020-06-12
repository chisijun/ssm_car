package org.study.car.model.vo;

import lombok.Data;
import org.study.car.base.BaseVo;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-08 11:52
 * @Description:
 */
@Data
public class CarVo extends BaseVo {

    /**
     * 车架号
     */
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
    private String plateNo;

    /**
     * 车主ID
     */
    private Long customId;

    /**
     * 卖出日期
     */
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
