package com.liang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getRequestURI().contains("ogin")){
            System.out.println("可以进入"+request.getRequestURI());
            return true;
        }
        if(request.getSession().getAttribute("userLoginInfo")!=null){
            System.out.println("欢迎"+ request.getSession().getAttribute("userLoginInfo"));
            System.out.println("允许进入"+request.getRequestURI());
            return true;
        }
        System.out.println("无法进入"+request.getRequestURI());
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
