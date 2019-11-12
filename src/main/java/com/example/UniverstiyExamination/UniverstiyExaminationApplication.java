package com.example.UniverstiyExamination;

import com.example.UniverstiyExamination.entity.Student;
import com.example.UniverstiyExamination.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UniverstiyExaminationApplication {
	@Autowired
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(UniverstiyExaminationApplication.class, args);
		Student student = new Student().setFirstName("Evgen").setLastName("Abc").setEmail("abc@bac.net")
				.setPassword("abc");

		StudentService studentService = run.getBean(StudentService.class);
		studentService.saveStudent(student);

	}

}
