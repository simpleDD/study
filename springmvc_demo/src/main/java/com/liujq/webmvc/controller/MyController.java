package com.liujq.webmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class    MyController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello","hellomvc");
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
