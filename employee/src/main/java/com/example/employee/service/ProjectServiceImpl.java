package com.example.employee.service;

import com.example.employee.dto.ProjectDto;
import com.example.employee.entity.Project;
import com.example.employee.enums.MessagesEnum;
import com.example.employee.mapper.Mapper;
import com.example.employee.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService
{
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository)
    {
        this.projectRepository=projectRepository;
    }

    @Override
    public ProjectDto getProjectById(int id)
    {
        return Mapper.projectDtoMapper(projectRepository.findById(id).get());
    }
    @Override
    public String addProject(Project project)
    {
        projectRepository.save(project);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String updateProjectById(int id, Project project)
    {
        Project pro= projectRepository.findById(id).get();

        pro.setProjectManager(project.getProjectManager());
        pro.setProjectName(project.getProjectName());
        projectRepository.save(pro);
        return MessagesEnum.successfullyUpdated.getValue();
    }
    @Override
    public String deleteProjectById(int id)
    {
        projectRepository.deleteById(id);
        return MessagesEnum.successfullyDeleted.getValue();
    }
}
