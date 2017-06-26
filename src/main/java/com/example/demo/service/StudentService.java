package com.example.demo.service;

import com.example.demo.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Service
public interface StudentService {

    public List<Student> getStudent();

    public Student getOne(Integer id);

}
