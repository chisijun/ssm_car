package org.study.car.dao;

import org.study.car.model.domain.Car;
import org.study.car.model.dto.CarQueryDto;
import org.study.car.model.vo.CarVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CarMapper extends Mapper<Car> {

    /**
     * 查询机动车列表 - 分页
     *
     * @param carQueryDto the car query dto
     *
     * @return the json result
     */
    List<CarVo> queryListWithPage(CarQueryDto carQueryDto);
}