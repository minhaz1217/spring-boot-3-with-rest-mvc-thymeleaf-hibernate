package com.minhazul.RestCrudApi.rest;

import com.minhazul.RestCrudApi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add((new Student("Minhazul", "Khan")));
        students.add((new Student("Hayat", "Khan")));
        students.add((new Student("Anik", "Khan")));

        return students;
    }
}
