package com.example.UniverstiyExamination.service;

import com.example.UniverstiyExamination.entity.Student;
import com.example.UniverstiyExamination.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor (onConstructor = @__(@Autowired))
public class StudentService {

    private StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

}
