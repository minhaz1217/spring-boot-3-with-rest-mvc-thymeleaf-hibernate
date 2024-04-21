package com.minhazul.CRUDWithDB.repository;

import com.minhazul.CRUDWithDB.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
