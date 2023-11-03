package org.example.service;

import org.example.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(Employee employee);
    List<Employee> findAll();
    Optional<Employee> findByID(Employee employee);

}
