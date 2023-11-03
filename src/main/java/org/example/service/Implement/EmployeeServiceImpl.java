package org.example.service.Implement;

import org.example.domain.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Employee delete(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        System.out.println("Hello");
        return null;
    }

    @Override
    public Employee findByID(Employee employee) {
        return null;
    }
}
