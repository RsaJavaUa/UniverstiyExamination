package com.example.UniverstiyExamination.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table (name = "specialisations")
public class Specialisation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String firstName;

    @OneToMany (mappedBy = "specialization")
    private List<Student> students;

}
