package org.study.car.model.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "t_role_menu")
public class RoleMenu {
    /**
     * 角色ID
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 菜单ID
     */
    @Id
    @Column(name = "menu_id")
    private Long menuId;
}