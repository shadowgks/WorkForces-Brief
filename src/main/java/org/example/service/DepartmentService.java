package org.example.service;

import org.example.domain.Department;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);
    Department update(Department department);
    Department delete(Department department);
    List<Department> findAll();
    List<Department> findByID(Long id);
}
