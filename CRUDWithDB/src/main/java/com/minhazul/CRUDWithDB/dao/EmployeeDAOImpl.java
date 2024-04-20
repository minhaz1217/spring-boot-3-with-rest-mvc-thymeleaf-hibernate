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

    @Override
    public Employee findById(int id) {
        Employee employee = _entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = _entityManager.merge(employee);
        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {
        Employee employee = _entityManager.find(Employee.class, id);
        _entityManager.remove(employee);
    }
}
