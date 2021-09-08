package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession httpSession, HttpServletRequest request, String username, String password){
        System.out.println(username + ":" + password);
//        request.setAttribute("userLoginInfo", username);
        httpSession.setAttribute("userLoginInfo", username);
        return "main";
    }


    @RequestMapping("/logout")
    public String logout(HttpSession httpSession){
        System.out.println("注销用户 "+httpSession.getAttribute("userLoginInfo"));
        httpSession.removeAttribute("userLoginInfo");
        return "redirect:/user/main";
    }
}
