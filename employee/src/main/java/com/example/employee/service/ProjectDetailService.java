package com.example.employee.service;

import com.example.employee.dto.ProjectDetailDto;
import com.example.employee.entity.ProjectDetail;

public interface ProjectDetailService
{
    ProjectDetailDto getProjectDetail(int id);
    String addProjectDetail(ProjectDetail projectDetail);
    String updateProjectDetail(int id, ProjectDetail projectDetail);
    String deleteProjectDetail(int id);
}
