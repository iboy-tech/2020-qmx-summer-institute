package com.ctgu.redisjpa.pojo;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 15:07
 * @PackageName:com.ctgu.redisjpa.demo.pojo
 * @Description: TODO
 * @Version:V1.0
 */
@Entity
@Table(name = "t_student")
@ToString
@Data
public class Student implements Serializable {
    private static  final  long serializableUID=1212121212121L;
    @Id
    @GeneratedValue(generator  = "myIdStrategy")
    @GenericGenerator(name = "myIdStrategy", strategy = "uuid")
    private String id;
    @Column(unique = true,nullable = false,length = 15)
    private String username;
    @Column(nullable = false,length = 300)
    private String password;
    @Column(nullable = false)
    private  Integer age;
    @Column(length = 11)
    private  String phone;
    @Column(nullable = false)
    private String sex;
}
