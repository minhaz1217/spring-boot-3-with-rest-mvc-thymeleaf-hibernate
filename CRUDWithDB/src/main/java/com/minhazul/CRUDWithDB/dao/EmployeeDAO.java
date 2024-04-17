package com.minhazul.CRUDWithDB.dao;

import com.minhazul.CRUDWithDB.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
