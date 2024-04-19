package com.minhazul.CRUDWithDB.service;

import com.minhazul.CRUDWithDB.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
