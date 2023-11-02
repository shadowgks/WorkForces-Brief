package org.example.service;

import org.example.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee delete(Employee employee);
    List<Employee> findAll();
    Employee findByID(Employee employee);

}
