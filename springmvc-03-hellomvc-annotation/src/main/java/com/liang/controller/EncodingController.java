package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EncodingController {
    @PostMapping("/e/t")
    public String test(@RequestParam("name") String name, Model model){
        model.addAttribute("msg", name);
        System.out.println(name);
        return "hello";
    }

}
