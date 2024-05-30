package com.example.prouf_of_concept.dao.repositories;

import com.example.prouf_of_concept.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
