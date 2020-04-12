package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentManagement {
    Map<String,Student> studentMap = new LinkedHashMap<>();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        if(studentMap.containsKey(student.getName())) {
            return new String("姓名重复");
        } else {
            studentMap.put(student.getName(),student);
            return new String("添加成功");
        }
    }



}
