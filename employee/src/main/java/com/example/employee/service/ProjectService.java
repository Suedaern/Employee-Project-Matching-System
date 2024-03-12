package com.example.employee.service;

import com.example.employee.dto.ProjectDto;
import com.example.employee.entity.Project;

public interface ProjectService
{
    ProjectDto getProjectById(int id);
    String addProject(Project project);
    String updateProjectById(int id,Project project);
    String deleteProjectById(int id);
}
