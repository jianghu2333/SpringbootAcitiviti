package com.example.activiti.springboot;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private HistoryService historyService;

    /**
     * @return
     * @Author Jh
     * @Description 创建报销流程
     * @Date 19:50 2020/8/18
     * @Param
     */
    @Test
    public void createProcess() {
        HashMap<String, Object> hashMap = new HashMap<>(16);
        hashMap.put("employeeName", "张三");
        hashMap.put("financeName", "财务一");
        runtimeService.startProcessInstanceByKey("demo", "1000", hashMap);
        Task task = taskService.createTaskQuery().processInstanceBusinessKey("1000").singleResult();
        taskService.complete(task.getId());
        System.out.println("任务流程创建并提交");
    }

    /**
     * @return
     * @Author Jh
     * @Description //TODO 执行流程
     * @Date 20:04 2020/8/18
     * @Param
     */
    @Test
    public void completeProcess() {
        Task task = taskService.createTaskQuery().processInstanceBusinessKey("1000").singleResult();
        System.out.println(task.getId());
        taskService.complete(task.getId());

    }

    /**
     * @return
     * @Author Jh
     * @Description //TODO 查詢所有任务
     * @Date 20:24 2020/8/18
     * @Param
     */
    @Test
    public void queryAllTask() {
        List<HistoricTaskInstance> list = historyService.createHistoricTaskInstanceQuery().taskAssignee("财务一").list();
        for (HistoricTaskInstance taskInstance : list) {
            System.out.println(taskInstance.toString());
        }

    }

}
