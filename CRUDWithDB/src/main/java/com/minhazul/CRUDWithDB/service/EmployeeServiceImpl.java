package com.minhazul.CRUDWithDB.service;

import com.minhazul.CRUDWithDB.entity.Employee;
import com.minhazul.CRUDWithDB.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeRepository _employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        _employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return _employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = _employeeRepository.findById(id);

        if(result.isPresent()){
            return result.get();
        }
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return _employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        _employeeRepository.deleteById(id);
    }
}
