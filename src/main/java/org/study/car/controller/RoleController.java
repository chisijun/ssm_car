package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Role;
import org.study.car.model.domain.User;
import org.study.car.model.dto.RoleQueryDto;
import org.study.car.service.RoleService;

import javax.annotation.Resource;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-05-21 15:13
 * @Description:
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    /**
     * 保存角色信息
     *
     * @param login 当前登录者
     * @param role   角色信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Role role) {

        Integer result = roleService.save(login, role);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询角色列表
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage", method = RequestMethod.POST)
    public JsonResult queryUserListWithPage(RoleQueryDto roleQueryDto) {

        PageInfo pageInfo = roleService.queryRoleListWithPage(roleQueryDto);

        return new JsonResult(true, "操作成功", pageInfo);
    }

    /**
     * 根据ID删除
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.POST)
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = roleService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", null);
        }

        return new JsonResult(true, "操作成功", result);
    }

//    public JsonResult save()

}
