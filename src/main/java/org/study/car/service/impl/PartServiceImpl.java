package org.study.car.service.impl;

import org.springframework.stereotype.Service;
import org.study.car.base.BaseService;
import org.study.car.dao.PartMapper;
import org.study.car.model.domain.Part;
import org.study.car.model.domain.User;
import org.study.car.model.dto.PartQueryDto;
import org.study.car.service.PartService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: chisj chisj@foxmal.com
 * @Date: 2020-04-28 17:36
 * @Description: the class part service impl
 */
@Service("partService")
public class PartServiceImpl extends BaseService<Part> implements PartService {

    @Resource
    private PartMapper partMapper;

    /**
     * 保存零部件信息
     *
     * @param login 当前登录者
     * @param part  零部件信息
     * @return the int
     */
    @Override
    public Integer save(User login, Part part) {
        return null;
    }

    /**
     * 查询零部件列表 - 分页
     *
     * @param partQueryDto the part query dto
     * @return the list
     */
    @Override
    public List<Part> queryListWithPage(PartQueryDto partQueryDto) {
        return null;
    }

    /**
     * 根据Id删除零部件信息
     *
     * @param id the id
     * @return the int.
     */
    @Override
    public Integer deleteById(Long id) {
        return null;
    }
}
