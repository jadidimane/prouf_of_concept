package com.example.prouf_of_concept.services;

import com.example.prouf_of_concept.dao.entities.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);
    public List<Student> students();
}
