package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@Controller
public class HelloController {
    //@ResponseBody(/"hello")

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
