package com.minhazul.cruddemo;

import com.minhazul.cruddemo.dao.StudentDAO;
import com.minhazul.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new student");

		Student tempStudent = new Student("Minhazul", "Hayat", "minhaz@minhazul.com");
		studentDAO.save(tempStudent);
		System.out.println("Student Created " + tempStudent.getId());
	}

}
