package com.minhazul.CRUDWithDB.dao;

import com.minhazul.CRUDWithDB.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
