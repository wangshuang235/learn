package com.springdemo.controller;

/*
 * @Author: cool
 * @Date: 2018/8/10 12:46
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}