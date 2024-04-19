package com.minhazul.CRUDWithDB.service;

import com.minhazul.CRUDWithDB.dao.EmployeeDAO;
import com.minhazul.CRUDWithDB.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeDAO _employeeDAO;
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        _employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return _employeeDAO.findAll();
    }
}
