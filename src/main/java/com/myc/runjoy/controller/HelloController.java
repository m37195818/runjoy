package com.myc.runjoy.controller;

import com.myc.runjoy.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * Copyright (C), 2008-2019, MYC Company
 * FileName: HelloController
 * Author:   Administrator
 * Date:     2019/6/15 23:00
 * Description:
 */
@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Student student;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println(student);
        return "Hello World";
    }


    @RequestMapping("/success")
    public String success(Map<String, Object> map)
    {
        map.put("hello", "<h1>您好</h1>");
        map.put("array", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
