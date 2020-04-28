package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Type;
import org.study.car.model.domain.User;
import org.study.car.model.dto.TypeQueryDto;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:43
 * @Description: the interface type service
 */
public interface TypeService extends IService<Type> {

    /**
     * 保存维修保养类型
     *
     * @param login the current user
     * @param type  the type
     *
     * @return  the int.
     */
    Integer save(User login, Type type);

    /**
     * 查询保养维修类型列表 - 分页
     *
     * @param typeQueryDto  the type query dto
     *
     * @return  the list.
     */
    List<Type> queryListWithPage(TypeQueryDto typeQueryDto);

    /**
     * 根据Id删除维修类型
     *
     * @param id    the id
     *
     * @return  the int.
     */
    Integer deleteById(Long id);
}
