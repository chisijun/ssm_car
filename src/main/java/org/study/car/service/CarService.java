package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Car;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CarQueryDto;
import org.study.car.model.vo.CarVo;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:30
 * @Description: the interface car service
 */
public interface CarService extends IService<Car> {

    /**
     * 保存汽车信息
     *
     * @param login 当前登录者
     * @param car   机动车信息
     *
     * @return  the int.
     */
    Integer save(User login, Car car);

    /**
     * 根据Id删除机动车信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    Integer deleteById(Long id);

    /**
     * 查询机动车列表 - 分页
     *
     * @param carQueryDto  the car query dto
     *
     * @return  the json result
     */
    List<CarVo> queryListWithPage(CarQueryDto carQueryDto);
}
