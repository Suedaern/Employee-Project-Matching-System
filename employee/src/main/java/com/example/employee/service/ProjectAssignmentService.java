package com.example.employee.service;

import com.example.employee.dto.ProjectAssignmentDto;
import com.example.employee.entity.ProjectAssignment;

public interface ProjectAssignmentService
{
    ProjectAssignmentDto getProjectAssignmentById(int id);
    String addProjectAssignment(ProjectAssignment projectAssignment);
    String updateProjectAssignmentById(int id,ProjectAssignment projectAssignment);
    String deleteProjectAssignment(int id);
}
