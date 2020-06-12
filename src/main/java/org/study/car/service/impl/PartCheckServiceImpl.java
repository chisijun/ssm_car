package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.PartCheckMapper;
import org.study.car.model.domain.PartCheck;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartCheckDto;
import org.study.car.service.PartCheckService;

import javax.annotation.Resource;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:39
 * @Description: the class part check service impl
 */
@Service("partCheckService")
public class PartCheckServiceImpl extends BaseService<PartCheck> implements PartCheckService {

    @Resource
    private PartCheckMapper partCheckMapper;

    /**
     * 零部件入库
     *
     * @param login        当前登录者
     * @param partCheckDto 零部件入库信息
     * @return the int
     */
    @Override
    public Integer checkIn(User login, PartCheckDto partCheckDto) {
        return null;
    }

    /**
     * 零部件出库
     *
     * @param login        当前登录者
     * @param partCheckDto 零部件出库信息
     * @return the int
     */
    @Override
    public Integer checkOut(User login, PartCheckDto partCheckDto) {
        return null;
    }
}
