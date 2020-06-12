package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.TypeMapper;
import org.study.car.model.domain.Type;
import org.study.car.model.domain.User;
import org.study.car.model.dto.TypeQueryDto;
import org.study.car.service.TypeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:44
 * @Description: the class type service impl
 */
@Service("typeService")
public class TypeServiceImpl extends BaseService<Type> implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    /**
     * 保存维修保养类型
     *
     * @param login the current user
     * @param type  the type
     *
     * @return the int.
     */
    @Override
    public Integer save(User login, Type type) {
        return null;
    }

    /**
     * 查询保养维修类型列表 - 分页
     *
     * @param typeQueryDto the type query dto
     *
     * @return the list.
     */
    @Override
    public List<Type> queryListWithPage(TypeQueryDto typeQueryDto) {
        return null;
    }

    /**
     * 根据Id删除维修类型
     *
     * @param id the id
     *
     * @return the int.
     */
    @Override
    public Integer deleteById(Long id) {
        return null;
    }
}
