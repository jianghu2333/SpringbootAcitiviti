package com.demo.demo.service.impl;

import com.demo.demo.mapper.TaskMapper;
import com.demo.demo.pojo.Task;
import com.demo.demo.service.TaskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.service.impl
 * @date 2020/10/29 20:56
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> list() {
        PageHelper.startPage(1, 10);
        List<Task> list = taskMapper.selectAll();
        PageInfo pageInfo = new PageInfo<>(list);
        //获取总记录数
        int total = (int) pageInfo.getTotal();
      return null;
    }
}
