package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Custom;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CustomQueryDto;
import org.study.car.service.CustomService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:17
 * @Description: the class custom controller
 */
@RestController
@RequestMapping("/custom")
public class CustomController {

    @Resource
    private CustomService customService;

    /**
     * 保存客户信息
     *
     * @param login 当前登录者
     * @param custom   客户信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Custom custom) {

        Integer result = customService.save(login, custom);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询客户列表 - 分页
     *
     * @param customQueryDto  the custom query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(CustomQueryDto customQueryDto) {

        List<Custom> customList = customService.queryListWithPage(customQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(customList));
    }

    /**
     * 根据Id删除客户信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = customService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
