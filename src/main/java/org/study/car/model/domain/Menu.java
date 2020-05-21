package org.study.car.model.domain;

import lombok.Data;
import org.study.car.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "t_menu")
public class Menu extends BaseEntity {

    /**
     * 菜单编码
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 状态
     */
    private String status;

    /**
     * 菜单URL
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 层级(最多三级1,2,3)
     */
    private Integer level;

    /**
     * 是否叶子节点,1不是0是
     */
    private Integer leaf;

    /**
     * 序号
     */
    private Integer number;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系统编码
     */
    @Column(name = "application_id")
    private Long applicationId;

}