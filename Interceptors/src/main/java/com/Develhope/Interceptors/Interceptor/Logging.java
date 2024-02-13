package com.Develhope.Interceptors.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class Logging implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String utenteAgent = request.getHeader("utenteAgent");
        System.out.println("utenteAgent:  +" + utenteAgent);
        return true;
    }

}
