package com.liang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@RestController     //若不使用Controller而使用这个 则类内所有方法都不走视图解析器 无需配置@ResponseBody
public class UserController {

    @RequestMapping(value = "/j1")
    @ResponseBody   //它就不会走视图解析器
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("杨亮", 3, "男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping(value = "/j2")
    @ResponseBody   //它就不会走视图解析器
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = new ArrayList<>();
        User user1 = new User("杨亮", 3, "男");
        User user2 = new User("杨亮", 3, "男");
        users.add(user1);
        users.add(user2);

        String str = mapper.writeValueAsString(users);
        return str;
    }
    @RequestMapping(value = "/j3")
    @ResponseBody   //它就不会走视图解析器
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(simpleDateFormat);
        String str = mapper.writeValueAsString(date);

        return str;
    }
}
//
//@[TOC](SpringMVC)
//        ssm：Mybatis+Spring+SpringMVC
//        MVC三层架构
//
//        详见工程文件SpringMVC
//        代码中
//        - 01----回顾servlet
//        - 02---第一个SpringMVC程序
//        - 03-注解使用SpringMVC
//        1. Model设置属性至前端渲染
//        2. RestFul格式网址传数据
//        3. UserController实现类 注入通过表单提交的属性
//        4. 编码 乱码
//        - 05 json有关

