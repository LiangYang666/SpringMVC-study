package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ModelTest1 {
    @GetMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response, Model model){
        System.out.println(request.getSession().getId());
        model.addAttribute("msg", "测试是不是可以操作servlet的request");
        return "hello";
    }

    @GetMapping("/m1/t3")
    public String test3(Model model){
        model.addAttribute("msg", "测试转发");
        return "hello";
    }

    @GetMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg", "测试重定向");
        return "redirect:/index.jsp";
    }
}
