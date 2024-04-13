package com.minhazul.cruddemo.dao;

import com.minhazul.cruddemo.entity.Student;
import org.springframework.stereotype.Component;

public interface StudentDAO {
    void save(Student student);
}
