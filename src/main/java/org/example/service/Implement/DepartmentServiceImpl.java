package org.example.service.Implement;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.repository.DepartmentRepository;
import org.example.service.DepartmentService;

import java.util.List;
import java.util.Optional;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department update(Department department) {
        Optional<Department> optionalEmployee = departmentRepository.findById(department.getId());
        if (optionalEmployee.isPresent()){
            return departmentRepository.save(department);
        }
        return null;
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findByID(Long id) {
        return departmentRepository.findById(id);
    }
}
