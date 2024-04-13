package com.minhazul.cruddemo.dao;

import com.minhazul.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Student findById(Integer id) {
        return _entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> studentQuery = _entityManager.createQuery("FROM Student order by lastName DESC", Student.class);
        return studentQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> studentQuery = _entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        studentQuery.setParameter("theData", lastName);
        return studentQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        _entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = _entityManager.find(Student.class, id);
        _entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int deleted = _entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return deleted;
    }

}
