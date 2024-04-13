package com.minhazul.cruddemo;

import com.minhazul.cruddemo.dao.StudentDAO;
import com.minhazul.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsLastName(studentDAO, "Hayat");
			updateStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new student");

		Student tempStudent = new Student("Minhazul", "Hayat", "minhaz@minhazul.com");
		studentDAO.save(tempStudent);
		System.out.println("Student Created " + tempStudent.getId());
	}

	private void readStudent(StudentDAO studentDAO){

		System.out.println("Creating new student");

		Student tempStudent = new Student("Minhazul", "Hayat", "minhaz@minhazul.com");
		studentDAO.save(tempStudent);
		int theId = tempStudent.getId();
		System.out.println("Student Created " + theId);

		System.out.println("Student Found" + studentDAO.findById(theId));
	}

	private void queryForStudents(StudentDAO studentDAO){
		List<Student> studentList = studentDAO.findAll();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	private void queryForStudentsLastName(StudentDAO studentDAO, String lastName){
		List<Student> studentList = studentDAO.findByLastName(lastName);
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	private void updateStudent(StudentDAO studentDAO){
		Student std = studentDAO.findById(1);
		std.setLastName("Wobbles");
		studentDAO.update(std);

		List<Student> studentList = studentDAO.findByLastName("Wobbles");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}



}
