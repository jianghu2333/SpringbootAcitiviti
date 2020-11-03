package com.demo.demo;

import com.demo.demo.pojo.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;

@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


//    @Test
//    public void contextLoadss() {
//        // 创建索引，会根据Item类的@Document注解信息来创建
//        elasticsearchTemplate.createIndex(People.class);
//        // 配置映射，会根据Item类中的id、Field等字段来自动完成映射
//        elasticsearchTemplate.putMapping(People.class);
//    }
//    @Test
//    public void contextLoads() {
//        CountDownLatch countDownLatch = new CountDownLatch(10);
//        countDownLatch.countDown();
//        SynchronousQueue<Object> objects = new SynchronousQueue<>();
//        String[] strings = StringUtils.commaDelimitedListToStringArray("1,2");
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
//        System.out.println(ApplicationContextInitializer.class.getName());
//    }


}
