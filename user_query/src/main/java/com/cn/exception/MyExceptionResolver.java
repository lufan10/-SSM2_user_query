package com.cn.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        ModelAndView mv = new ModelAndView();
        if(e instanceof ClassCastException){
            mv.addObject("info","类型转换异常");

        }else if (e instanceof EmptyResultDataAccessException){
            mv.addObject("info","空结果数据访问异常");
        }
        mv.setViewName("error"); //error.jsp <h1>${info}</h1>
        return mv;
    }
}
