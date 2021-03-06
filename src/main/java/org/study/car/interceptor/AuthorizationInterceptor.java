/**  
 * @Title: AuthorizationInterceptor.java
 * @Package org.csun.nc.interceptor
 * @Description: TODO
 * @author chisj chisj@foxmail.com
 * @date 2017年9月12日
 */
package org.study.car.interceptor;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.study.car.annotation.Authorization;
import org.study.car.common.JsonResult;
import org.study.car.config.Constants;
import org.study.car.model.entity.TokenModel;
import org.study.car.service.TokenManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * ClassName: AuthorizationInterceptor 
 * @Description: 用spring自带的拦截器来处理@Authorization 注解
 * @author chisj chisj@foxmail.com
 * @date 2017年9月12日
 */
@Slf4j
public class AuthorizationInterceptor implements HandlerInterceptor {
	
    @Autowired
    private TokenManager tokenManager;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
    	
    	//如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //从header中得到token
        String authorization = httpServletRequest.getHeader(Constants.AUTHORIZATION);
        log.info("=====> authorization = {}", authorization);
        //验证token
        TokenModel model = tokenManager.getToken(authorization);
        if (tokenManager.checkToken(model)) {
            //如果token验证成功，将token对应的用户id存在request中，便于之后注入
            httpServletRequest.setAttribute(Constants.CURRENT_USER_ID, model.getUserId());
            return true;
        }
        //如果验证token失败，并且方法注明了Authorization，返回401错误
        if (method.getAnnotation(Authorization.class) != null) {
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            JSONObject jsObject = JSONObject.fromObject(new JsonResult(false, "用户尚未登录", ""));
            httpServletResponse.getWriter().write(jsObject.toString());
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
