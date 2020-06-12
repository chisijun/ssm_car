package org.study.car.dao;

import org.study.car.model.domain.Custom;
import org.study.car.model.dto.CustomQueryDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CustomMapper extends Mapper<Custom> {

    /**
     * 查询客户列表 - 分页
     *
     * @param customQueryDto the custom query dto
     *
     * @return the list.
     */
    List<Custom> queryListWithPage(CustomQueryDto customQueryDto);
}