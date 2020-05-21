package org.study.car.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 11:59
 * @Description:
 */
@Data
public class MenuVo {

    private Long id;

    private String name;

    private String icon;

    private String url;

    private List<MenuVo> children;

    @JsonIgnore
    private boolean hasMenu = false;

    /**
     * 父id
     */
    @JsonIgnore
    private Long pid;

}
