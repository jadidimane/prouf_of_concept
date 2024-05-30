package com.example.prouf_of_concept.services;

import com.example.prouf_of_concept.dao.entities.Student;
import com.example.prouf_of_concept.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentManager implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
       try{
           studentRepository.delete(student);
       }catch(Exception e){
           System.out.println("delete failed");
       }
    }

    @Override
    public List<Student> students() {
        return studentRepository.findAll();
    }
}
