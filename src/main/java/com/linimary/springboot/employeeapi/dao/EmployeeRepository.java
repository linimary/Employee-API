package com.linimary.springboot.employeeapi.dao;

import com.linimary.springboot.employeeapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
