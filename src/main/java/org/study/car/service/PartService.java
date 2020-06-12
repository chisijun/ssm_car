package org.study.car.service;

import org.study.car.base.IService;
import org.study.car.model.domain.Part;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartQueryDto;

import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:36
 * @Description: the interface part service
 */
public interface PartService extends IService<Part> {

    /**
     * 保存零部件信息
     *
     * @param login 当前登录者
     * @param part  零部件信息
     *
     * @return  the int
     */
    Integer save(User login, Part part);

    /**
     * 查询零部件列表 - 分页
     *
     * @param partQueryDto  the part query dto
     *
     * @return  the list
     */
    List<Part> queryListWithPage(PartQueryDto partQueryDto);

    /**
     * 根据Id删除零部件信息
     *
     * @param id    the id
     *
     * @return  the int.
     */
    Integer deleteById(Long id);
}
