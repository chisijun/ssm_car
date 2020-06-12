package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Menu;
import org.study.car.model.domain.User;
import org.study.car.model.dto.MenuQueryDto;
import org.study.car.model.vo.MenuVo;
import org.study.car.service.MenuService;
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
    @Resource
    private MenuService menuService;

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

    /**
     * 保存菜单信息
     *
     * @param login 当前登录者
     * @param menu  菜单信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Menu menu) {

        Integer result = menuService.save(login, menu);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询菜单列表 - 分页
     *
     * @param menuQueryDto  the car query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(MenuQueryDto menuQueryDto) {

        List<MenuVo> menuVoList = menuService.queryListWithPage(menuQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(menuVoList));
    }

    /**
     * 根据Id删除菜单信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = menuService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
