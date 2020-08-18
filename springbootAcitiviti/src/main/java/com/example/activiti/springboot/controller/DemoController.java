package com.example.activiti.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Jh
 * @Date 2020/8/18 20:48
 * @Version 1.0
 */
@RestController
public class DemoController {

    @GetMapping("/test")
    public void test(){
        System.out.println("sdsdsdsdsd");
    }
}
