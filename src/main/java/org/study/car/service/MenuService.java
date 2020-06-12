package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Menu;
import org.study.car.model.domain.User;
import org.study.car.model.dto.MenuQueryDto;
import org.study.car.model.vo.MenuVo;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-06-10 13:20
 * @Description:
 */
public interface MenuService extends IService<Menu> {

    /**
     * 保存菜单信息
     *
     * @param login 当前登录者
     * @param menu  菜单信息
     *
     * @return  the json result
     */
    Integer save(User login, Menu menu);

    /**
     * 查询菜单列表 - 分页
     *
     * @param menuQueryDto  the car query dto
     *
     * @return  the json result
     */
    List<MenuVo> queryListWithPage(MenuQueryDto menuQueryDto);

    /**
     * 根据Id删除菜单信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    Integer deleteById(Long id);
}
