package com.jufeng.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class helloword {


    @ResponseBody
    @RequestMapping("/hello")
    public String handle(){
        return "hello Orange";
    }
}
