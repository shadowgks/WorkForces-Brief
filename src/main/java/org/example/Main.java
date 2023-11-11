package org.example;


import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.service.DepartmentService;
import org.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);
        DepartmentService departmentService = appContext.getBean("departmentService", DepartmentService.class);

//        //Added Department
//        Department department = new Department("D2");
//        departmentService.save(department);

//        //Get Department by ID
//        Department department = departmentService.findByID(1L).get();
//        //Added Employee
//        Employee employee = new Employee("Simo", 10000.0, department);
//        Employee employee1 = new Employee("issam", 500.0, department);
//        Employee employee2 = new Employee("bilal", 600.0, department);
//        Employee employee3 = new Employee("salah", 700.0, department);
//
//        employeeService.save(employee);
//        employeeService.save(employee1);
//        employeeService.save(employee2);
//        employeeService.save(employee3);

//        //Get All employee
//        System.out.println(employeeService.findAll());
    }
}