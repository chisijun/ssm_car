package org.study.car.controller;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.model.vo.MenuVo;
import org.study.car.service.RoleMenuService;
import org.study.car.utils.TreeUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 11:11
 * @Description:
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private RoleMenuService roleMenuService;

    @RequestMapping(value = "/getMenu")
    public Map getMenu(Long roleId) {

        Map<String, Object> result = Maps.newHashMap();

        List<MenuVo> menuVoList = roleMenuService.queryMenuListByRoleId(roleId);

        List<MenuVo> data = TreeUtil.getChildMenuVos(menuVoList, 0L);

        result.put("status", 0);
        result.put("msg", "ok");
        result.put("data", data);

        return result;
    }

}
