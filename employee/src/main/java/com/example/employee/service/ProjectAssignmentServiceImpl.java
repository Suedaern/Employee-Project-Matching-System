package com.example.employee.service;

import com.example.employee.mapper.Mapper;
import com.example.employee.repository.ProjectAssignmentRepository;
import com.example.employee.enums.MessagesEnum;
import com.example.employee.dto.ProjectAssignmentDto;
import com.example.employee.entity.ProjectAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectAssignmentServiceImpl implements ProjectAssignmentService
{
    private final ProjectAssignmentRepository projectAssignmentRepository;

    @Autowired
    public ProjectAssignmentServiceImpl(ProjectAssignmentRepository projectAssignmentRepository)
    {
        this.projectAssignmentRepository=projectAssignmentRepository;
    }
    @Override
    public ProjectAssignmentDto getProjectAssignmentById(int id)
    {
        return Mapper.projectAssignmentDtoMapper(projectAssignmentRepository.findById(id).get());
    }
    @Override
    public String addProjectAssignment(ProjectAssignment projectAssignment)
    {
        projectAssignmentRepository.save(projectAssignment);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String updateProjectAssignmentById(int id,ProjectAssignment projectAssignment)
    {
        ProjectAssignment proA= projectAssignmentRepository.findById(id).get();
        if(projectAssignment.getUser()!=null)
        {
            proA.setUser(projectAssignment.getUser());
        }
        if(projectAssignment.getProject()!=null)
        {
            proA.setProject(projectAssignment.getProject());
        }
        projectAssignmentRepository.save(proA);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String deleteProjectAssignment(int id)
    {
        projectAssignmentRepository.deleteById(id);
        return MessagesEnum.successfullyDeleted.getValue();
    }
}
