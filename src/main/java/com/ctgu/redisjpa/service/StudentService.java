package com.ctgu.redisjpa.service;

import com.ctgu.redisjpa.pojo.Student;

import java.util.List;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:17
 * @PackageName:com.ctgu.redisjpa.demo.service
 * @Description: TODO
 * @Version:V1.0
 */

public interface StudentService {
    Student saveAndFlush(Student student);
    List<Student> findAll();
}
