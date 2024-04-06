package com.linimary.springboot.employeeapi.service;

import com.linimary.springboot.employeeapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
