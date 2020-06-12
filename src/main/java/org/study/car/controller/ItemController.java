package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
import org.study.car.model.domain.Item;
import org.study.car.model.domain.User;
import org.study.car.model.dto.ItemQueryDto;
import org.study.car.service.ItemService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:35
 * @Description: the class item controller
 */
@RestController
@RequestMapping("/item")
public class ItemController {


    @Resource
    private ItemService itemService;

    /**
     * 保存客户信息
     *
     * @param login 当前登录者
     * @param item  项目信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Item item) {

        Integer result = itemService.save(login, item);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询项目列表 - 分页
     *
     * @param itemQueryDto  the item query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(ItemQueryDto itemQueryDto) {

        List<Item> itemList = itemService.queryListWithPage(itemQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(itemList));
    }

    /**
     * 根据Id删除项目信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = itemService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
