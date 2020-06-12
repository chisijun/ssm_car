package org.study.car.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.CarMapper;
import org.study.car.model.domain.Car;
import org.study.car.model.domain.User;
import org.study.car.model.dto.CarQueryDto;
import org.study.car.model.vo.CarVo;
import org.study.car.service.CarService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:31
 * @Description: the class car service impl
 */
@Service("carService")
public class CarServiceImpl extends BaseService<Car> implements CarService {

    @Resource
    private CarMapper carMapper;

    /**
     * 保存汽车信息
     *
     * @param login 当前登录者
     * @param car   机动车信息
     *
     * @return the int.
     */
    @Override
    public Integer save(User login, Car car) {

        car.setUpdateInfo(login);

        if (car.isNew()) {

            return carMapper.insertSelective(car);
        }

        return carMapper.updateByPrimaryKeySelective(car);
    }

    /**
     * 根据Id删除机动车信息
     *
     * @param id the id
     *
     * @return the json result.
     */
    @Override
    public Integer deleteById(Long id) {

        return carMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询机动车列表 - 分页
     *
     * @param carQueryDto the car query dto
     *
     * @return the json result
     */
    @Override
    public List<CarVo> queryListWithPage(CarQueryDto carQueryDto) {

        PageHelper.startPage(carQueryDto.getPageNum(), carQueryDto.getPageSize());

        return carMapper.queryListWithPage(carQueryDto);
    }
}
