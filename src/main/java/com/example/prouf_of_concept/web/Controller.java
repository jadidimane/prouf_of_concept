package com.example.prouf_of_concept.web;

import com.example.prouf_of_concept.dao.entities.Student;
import com.example.prouf_of_concept.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.addStudent(student);
        return "student added successfully";
    }

}
