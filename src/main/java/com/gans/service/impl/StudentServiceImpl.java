package com.gans.service.impl;

import com.gans.dao.StudentMapper;
import com.gans.pojo.Student;
import com.gans.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student findStudentById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
