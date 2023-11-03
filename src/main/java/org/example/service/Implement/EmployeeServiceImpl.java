package org.example.service.Implement;

import org.example.domain.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
        if (optionalEmployee.isPresent()){
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        System.out.println("hello");
        return null;
//        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findByID(Employee employee) {
        return employeeRepository.findById(employee.getId());
    }
}
