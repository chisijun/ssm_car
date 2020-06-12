package org.study.car.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartCheckDto;
import org.study.car.service.PartCheckService;

import javax.annotation.Resource;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:38
 * @Description: the class part check controller
 */
@RestController
@RequestMapping("/partCheck")
public class PartCheckController {

    @Resource
    private PartCheckService partCheckService;

    /**
     * 零部件入库
     *
     * @param login 当前登录者
     * @param partCheckDto  零部件入库信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/in")
    public JsonResult checkIn(@CurrentUser User login, PartCheckDto partCheckDto) {

        Integer result = partCheckService.checkIn(login, partCheckDto);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }


    /**
     * 零部件出库
     *
     * @param login 当前登录者
     * @param partCheckDto  零部件出库信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/out")
    public JsonResult checkOut(@CurrentUser User login, PartCheckDto partCheckDto) {

        Integer result = partCheckService.checkOut(login, partCheckDto);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
