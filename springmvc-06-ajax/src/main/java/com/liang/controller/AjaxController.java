package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "test";
    }

    @RequestMapping("/a1")
    public void test2(String name, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        request.setAttribute("name", name);
        System.out.println("a1 name==>"+name);
        response.getWriter().print(name);

    }

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("YL", 2, "男"));
        userList.add(new User("ZZ", 3, "男"));
        userList.add(new User("CC", 1, "女"));
        return userList;
    }
    @RequestMapping("/a3")
    public String a3(String name, String password){
        String msg="";
        if(name!=null){
            if(name.equals("admin")){
                msg = "OK";
            }else {
                msg = "用户名输入有误";
            }
        }
        if(password!=null){
            if(password.equals("123456")){
                msg = "OK";
            }else {
                msg = "密码错误";
            }
        }
        return msg;

    }
}
