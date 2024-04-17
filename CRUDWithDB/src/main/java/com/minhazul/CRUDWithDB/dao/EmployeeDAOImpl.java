package com.minhazul.CRUDWithDB.dao;

import com.minhazul.CRUDWithDB.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements  EmployeeDAO {

    private EntityManager _entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        _entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = _entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }
}
