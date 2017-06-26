package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Component
@Mapper
public interface StudentMapper {

    public List<Student> getStudent();

    public Student getOne(Integer id);
}
