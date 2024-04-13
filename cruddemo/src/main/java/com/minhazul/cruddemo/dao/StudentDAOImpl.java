package com.minhazul.cruddemo.dao;

import com.minhazul.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements  StudentDAO {
    private EntityManager _entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        _entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student){
        _entityManager.persist(student);
    }

}
