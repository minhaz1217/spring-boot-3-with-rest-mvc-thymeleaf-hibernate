package com.minhazul.CRUDWithDB.rest;

import com.minhazul.CRUDWithDB.dao.EmployeeDAO;
import com.minhazul.CRUDWithDB.entity.Employee;
import com.minhazul.CRUDWithDB.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = _employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);

        Employee newEmployee = _employeeService.save(employee);
        return newEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = _employeeService.save(employee);
        return updatedEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = _employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee not found - " + employeeId);
        }
        _employeeService.deleteById(employeeId);
        return "Deleted - " + employeeId;
    }




}
