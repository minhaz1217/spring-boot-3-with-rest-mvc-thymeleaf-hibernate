package com.minhazul.cruddemo.dao;

import com.minhazul.cruddemo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);
}
