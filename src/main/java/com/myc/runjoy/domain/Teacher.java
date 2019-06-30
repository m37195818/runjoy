package com.myc.runjoy.domain;

/**
 * Copyright (C), 2008-2019, MYC Company
 * FileName: Teacher
 * Author:   Administrator
 * Date:     2019/6/15 21:40
 * Description:
 */
public class Teacher {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
