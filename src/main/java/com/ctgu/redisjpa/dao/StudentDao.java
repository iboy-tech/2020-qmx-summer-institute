package com.ctgu.redisjpa.dao;

import com.ctgu.redisjpa.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:12
 * @PackageName:com.ctgu.redisjpa.demo.dao
 * @Description: TODO
 * @Version:V1.0
 */
@Repository
public interface StudentDao extends JpaRepository<Student,String> {
}
