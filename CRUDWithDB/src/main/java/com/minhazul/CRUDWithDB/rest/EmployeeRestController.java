package com.minhazul.CRUDWithDB.rest;

import com.minhazul.CRUDWithDB.dao.EmployeeDAO;
import com.minhazul.CRUDWithDB.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController{
    private EmployeeDAO _employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO){
        _employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return _employeeDAO.findAll();
    }
}
