package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.ItemMapper;
import org.study.car.model.domain.Item;
import org.study.car.model.domain.User;
import org.study.car.model.dto.ItemQueryDto;
import org.study.car.service.ItemService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:34
 * @Description: the class item service impl
 */
@Service("itemService")
public class ItemServiceImpl extends BaseService<Item> implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    /**
     * 保存客户信息
     *
     * @param login 当前登录者
     * @param item  项目信息
     * @return the int
     */
    @Override
    public Integer save(User login, Item item) {
        return null;
    }

    /**
     * 查询项目列表 - 分页
     *
     * @param itemQueryDto the item query dto
     * @return the int.
     */
    @Override
    public List<Item> queryListWithPage(ItemQueryDto itemQueryDto) {
        return null;
    }

    /**
     * 根据Id删除项目信息
     *
     * @param id the id
     * @return the int.
     */
    @Override
    public Integer deleteById(Long id) {
        return null;
    }
}
