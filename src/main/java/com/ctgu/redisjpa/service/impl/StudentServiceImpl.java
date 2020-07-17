package com.ctgu.redisjpa.service.impl;

import com.ctgu.redisjpa.dao.StudentDao;
import com.ctgu.redisjpa.pojo.Student;
import com.ctgu.redisjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:18
 * @PackageName:com.ctgu.redisjpa.demo.service.impl
 * @Description: TODO
 * @Version:V1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student saveAndFlush(Student student) {
        return studentDao.saveAndFlush(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
