package com.minhazul.CRUDWithDB.service;

import com.minhazul.CRUDWithDB.dao.EmployeeDAO;
import com.minhazul.CRUDWithDB.entity.Employee;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public Employee findById(int id) {
        return _employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return _employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        _employeeDAO.deleteById(id);
    }
}
