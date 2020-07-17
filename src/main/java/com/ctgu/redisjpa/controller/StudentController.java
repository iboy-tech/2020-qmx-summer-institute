package com.ctgu.redisjpa.controller;

import com.ctgu.redisjpa.common.Result;
import com.ctgu.redisjpa.pojo.Student;
import com.ctgu.redisjpa.service.RedisService;
import com.ctgu.redisjpa.service.StudentService;
import com.ctgu.redisjpa.util.ResultUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:14
 * @PackageName:com.ctgu.redisjpa.demo.controller
 * @Description: TODO
 * @Version:V1.0
 */


@RestController
@Slf4j
@RequestMapping("/students/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private RedisService redisService;

    @PostMapping("/")
    public Result add(@RequestBody Student student) {
        log.info("接收的Student：{}", student);
        studentService.saveAndFlush(student);
        redisService.set(student.getUsername(),student);
        log.info("插入之后的student：{}",student);
        log.info("redis的对象：{}",redisService.get(student.getUsername()));
        return ResultUtil.success();
    }

    @GetMapping("/")
    public HashMap getAll() {
        log.info("查询所有学生信息");
        List<Student> students = studentService.findAll();
        HashMap data=new HashMap();
        data.put("code",0);
        data.put("count",students.size());
        data.put("data",students);
        data.put("msg","请求成功");
        return data;
    }
}
