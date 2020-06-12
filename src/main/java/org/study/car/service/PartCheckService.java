package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.PartCheck;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartCheckDto;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:39
 * @Description: the interface part check service
 */
public interface PartCheckService extends IService<PartCheck> {

    /**
     * 零部件入库
     *
     * @param login 当前登录者
     * @param partCheckDto  零部件入库信息
     *
     * @return  the int
     */
    Integer checkIn(User login, PartCheckDto partCheckDto);

    /**
     * 零部件出库
     *
     * @param login 当前登录者
     * @param partCheckDto  零部件出库信息
     *
     * @return  the int
     */
    Integer checkOut(User login, PartCheckDto partCheckDto);
}
