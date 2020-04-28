package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Type;
import org.study.car.model.domain.User;
import org.study.car.model.dto.TypeQueryDto;
import org.study.car.service.TypeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:44
 * @Description: the class type controller
 */
@RestController
@RequestMapping("/type")
public class TypeController {

    @Resource
    private TypeService typeService;

    /**
     * 保存维修保养类型
     *
     * @param login the current user
     * @param type  the type
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Type type) {

        Integer result = typeService.save(login, type);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询保养维修类型列表 - 分页
     *
     * @param typeQueryDto  the type query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(TypeQueryDto typeQueryDto) {

        List<Type> typeList = typeService.queryListWithPage(typeQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(typeList));
    }

    /**
     * 根据Id删除维修类型
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = typeService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
