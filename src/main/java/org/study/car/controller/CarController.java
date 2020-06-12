package org.study.car.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.car.annotation.Authorization;
import org.study.car.annotation.CurrentUser;
import org.study.car.common.JsonResult;
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
 * @Description: the class car controller
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Resource
    private CarService carService;

    /**
     * 保存汽车信息
     *
     * @param login 当前登录者
     * @param car   机动车信息
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/save")
    public JsonResult save(@CurrentUser User login, Car car) {

        Integer result = carService.save(login, car);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

    /**
     * 查询机动车列表 - 分页
     *
     * @param carQueryDto  the car query dto
     *
     * @return  the json result
     */
    @Authorization
    @RequestMapping(value = "/queryListWithPage")
    public JsonResult queryListWithPage(CarQueryDto carQueryDto) {

        List<CarVo> carVoList = carService.queryListWithPage(carQueryDto);

        return new JsonResult(true, "操作成功", new PageInfo<>(carVoList));
    }

    /**
     * 根据Id删除机动车信息
     *
     * @param id    the id
     *
     * @return  the json result.
     */
    @Authorization
    @RequestMapping(value = "/deleteById/{id}")
    public JsonResult deleteById(@PathVariable Long id) {

        Integer result = carService.deleteById(id);
        if (result < 1) {
            return new JsonResult(false, "操作失败", result);
        }

        return new JsonResult(true, "操作成功", result);
    }

}
