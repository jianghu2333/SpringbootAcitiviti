package com.demo.demo.controller;

import com.demo.demo.pojo.People;
import com.demo.demo.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Jh
 * @Date 2020/10/12 13:37
 * @Version 1.0
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
//        throw new RuntimeException("yichang");
        return "sssssssssssssssssss";
    }

    @PostMapping("/demo2")
    public String demo(@RequestBody People people){
            System.out.println(people.toString());
        return "sssssssssssssssssss"+people.toString();
    }

    @PostMapping("/login")
    public Map login(@RequestBody User user){
        Map<String, String> respMap = new HashMap<>();

        if (user.getUsername().equals("root") && user.getPassword().equals("123456")){
            respMap.put("msg","success");
            respMap.put("token","few15qr1w51f541g45er1g45er1g45");
        }else {
            respMap.put("msg","falied");
        }
        return respMap;
    }
}
