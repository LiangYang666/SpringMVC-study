package com.liang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test1(){
        System.out.println("运行了==>test1");
        return "OK";
    }

}
