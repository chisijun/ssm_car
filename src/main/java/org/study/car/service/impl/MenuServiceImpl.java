package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.MenuMapper;
import org.study.car.model.domain.Menu;
import org.study.car.model.domain.User;
import org.study.car.model.dto.MenuQueryDto;
import org.study.car.model.vo.MenuVo;
import org.study.car.service.MenuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 13:20
 * @Description:
 */
@Service("menuService")
public class MenuServiceImpl extends BaseService<Menu> implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    /**
     * 保存菜单信息
     *
     * @param login 当前登录者
     * @param menu  菜单信息
     * @return the json result
     */
    @Override
    public Integer save(User login, Menu menu) {
        return null;
    }

    /**
     * 查询菜单列表 - 分页
     *
     * @param menuQueryDto the car query dto
     * @return the json result
     */
    @Override
    public List<MenuVo> queryListWithPage(MenuQueryDto menuQueryDto) {
        return null;
    }

    /**
     * 根据Id删除菜单信息
     *
     * @param id the id
     * @return the json result.
     */
    @Override
    public Integer deleteById(Long id) {
        return null;
    }
}
