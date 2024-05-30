package com.example.prouf_of_concept.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String name;
    private String mail;


}
