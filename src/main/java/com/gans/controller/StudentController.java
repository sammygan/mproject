package com.gans.controller;

import com.gans.pojo.Student;
import com.gans.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("findStudentById")
    public String findStudentById(Model model, int id) {
        Student student = studentService.findStudentById(id);
        model.addAttribute("student",student);
        return "student";
    }
}
