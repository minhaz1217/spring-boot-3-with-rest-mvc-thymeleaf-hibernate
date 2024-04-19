package com.minhazul.CRUDWithDB.rest;

import com.minhazul.CRUDWithDB.dao.EmployeeDAO;
import com.minhazul.CRUDWithDB.entity.Employee;
import com.minhazul.CRUDWithDB.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController{
    private EmployeeService _employeeService;

    public EmployeeRestController(EmployeeService employeeService){
        _employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return _employeeService.findAll();
    }
}
