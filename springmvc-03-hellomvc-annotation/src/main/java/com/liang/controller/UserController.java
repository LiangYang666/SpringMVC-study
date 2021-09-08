package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test1(@RequestParam("a") int a, String b, Model model){
        System.out.println(a+3);
        System.out.println(b);
        model.addAttribute("msg", b);
        return "hello";
    }

    @RequestMapping("/t2")
    public String test1(User user, ModelMap map){
        System.out.println(user);
        map.addAttribute("msg", user.getName());
        return "hello";
    }
}
