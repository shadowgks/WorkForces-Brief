package org.example.service;

import org.example.domain.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department save(Department department);
    Department update(Department department);
    void delete(Department department);
    List<Department> findAll();
    Optional<Department> findByID(Long id);
}
