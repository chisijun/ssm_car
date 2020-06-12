package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Item;
import org.study.car.model.domain.User;
import org.study.car.model.dto.ItemQueryDto;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:32
 * @Description: the interface item service
 */
public interface ItemService extends IService<Item> {

    /**
     * 保存客户信息
     *
     * @param login 当前登录者
     * @param item  项目信息
     *
     * @return  the int
     */
    Integer save(User login, Item item);

    /**
     * 查询项目列表 - 分页
     *
     * @param itemQueryDto  the item query dto
     *
     * @return  the int.
     */
    List<Item> queryListWithPage(ItemQueryDto itemQueryDto);

    /**
     * 根据Id删除项目信息
     *
     * @param id    the id
     *
     * @return  the int.
     */
    Integer deleteById(Long id);
}
