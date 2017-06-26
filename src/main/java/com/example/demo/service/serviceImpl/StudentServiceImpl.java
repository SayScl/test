package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Service
public class StudentServiceImpl implements StudentService {

@Autowired
private StudentMapper studentMapper;

    @Override
    public List<Student> getStudent() {
        List<Student> student = studentMapper.getStudent();
        return student;
    }

    @Override
    public Student getOne(Integer id) {
        Student student = studentMapper.getOne(id);
        return student;
    }
}
