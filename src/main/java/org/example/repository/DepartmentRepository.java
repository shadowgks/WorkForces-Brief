package org.example.repository;

import org.example.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
