package com.example.employee.repository;

import com.example.employee.entity.ProjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment,Integer> {
}
