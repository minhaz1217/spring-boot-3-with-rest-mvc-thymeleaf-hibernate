package com.minhazul.RestCrudApi.rest;

import com.minhazul.RestCrudApi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;
    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add((new Student("Minhazul", "Khan")));
        students.add((new Student("Hayat", "Khan")));
        students.add((new Student("Anik", "Khan")));
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        if(studentId <= 0 || studentId >= students.size()){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return students.get(studentId);
    }
}
