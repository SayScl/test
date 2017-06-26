package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Controller
public class HelloSb {

    @Autowired
    private StudentService studentService;

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("student")
    public Student Student(){
        Student stu=new Student();
        stu.setId(1);
        stu.setAge(22);
        stu.setName("say");
        return stu;
    }


    @RequestMapping("getStudent")
    public String get(Model model){
        List<Student> student = studentService.getStudent();
        System.out.println(student.get(0).getName());
        model.addAttribute("list",student);
        return "list";
    }
    @RequestMapping("getOne")
    public String getOne(Model model){
        Student student = studentService.getOne(1);
        model.addAttribute("student",student);
        return "list";
    }


    @RequestMapping("/goto")
    public String gotoo(Model model, @RequestParam Integer id){
        System.out.print(id);
        Student student1 = studentService.getOne(id);
        model.addAttribute("date",new Date());
        model.addAttribute("student",student1);
        return "list1";
    }
}
