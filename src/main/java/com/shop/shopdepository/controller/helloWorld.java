package com.shop.shopdepository.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld！！！";
    }
}
