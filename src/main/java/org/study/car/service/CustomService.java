package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Custom;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CustomQueryDto;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:15
 * @Description: the interface custom service
 */
public interface CustomService extends IService<Custom> {

    /**
     * 保存客户信息
     *
     * @param login 当前登录者
     * @param custom   客户信息
     *
     * @return  the int.
     */
    Integer save(User login, Custom custom);

    /**
     * 查询客户列表 - 分页
     *
     * @param customQueryDto  the custom query dto
     *
     * @return  the list.
     */
    List<Custom> queryListWithPage(CustomQueryDto customQueryDto);

    /**
     * 根据Id客户信息
     *
     * @param id    the id
     *
     * @return  the int.
     */
    Integer deleteById(Long id);
}
