package org.example.service.Implement;

import org.example.domain.Department;
import org.example.repository.DepartmentRepository;
import org.example.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return null;
    }

    @Override
    public Department update(Department department) {
        return null;
    }

    @Override
    public Department delete(Department department) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public List<Department> findByID(Long id) {
        return null;
    }
}
