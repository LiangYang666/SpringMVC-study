package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    //普通风格 即访问 http://localhost:8080/add?a=1&b=2
//    @RequestMapping("/add")
//    public String test1(int a, int b, Model model){
//        int result = a+b;
//        model.addAttribute("result", "结果为"+result);
//        return "result/test";
//    }

    // ResultFul风格 即 http://localhost:8080/add/2/3
//    @RequestMapping("/add/{a}/{b}")     //默认为GET方法=@GetMapping("/add/{a}/{b}")

    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("result", "使用GET请求 结果为"+result);
        return "result/test";
    }
    @PostMapping ("/add/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("result", "使用POST请求 结果为"+result);
        return "result/test";
    }
}
