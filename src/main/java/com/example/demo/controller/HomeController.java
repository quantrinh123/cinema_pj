package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guest")
public class HomeController {

    @GetMapping("/home")
    public String show(){
        return "home/main";
    }

    // test header
    @GetMapping("/header")
    public String showHeader(){
        return "layout/header";
    }
}
