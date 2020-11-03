package com.demo.demo.controller;

import com.demo.demo.pojo.Task;
import com.demo.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.controller
 * @date 2020/10/29 20:57
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @RequestMapping("/test")
    public void test(){
      List<Task> list=taskService.list();
    }

}
