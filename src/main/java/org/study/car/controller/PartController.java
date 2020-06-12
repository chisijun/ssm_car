package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Part;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartQueryDto;
import org.study.car.service.PartService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:37
 * @Description: the class part controller
 */
@RestController
@RequestMapping("/part")
public class PartController {

    @Resource
    private PartService partService;

    /**
     * 保存零部件信息
     *
     * @param login 当前登录者
     * @param part  零部件信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Part part) {

        Integer result = partService.save(login, part);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询零部件列表 - 分页
     *
     * @param partQueryDto  the part query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(PartQueryDto partQueryDto) {

        List<Part> partList = partService.queryListWithPage(partQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(partList));
    }

    /**
     * 根据Id删除零部件信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = partService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
