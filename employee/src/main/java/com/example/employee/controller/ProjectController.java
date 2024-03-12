package com.example.employee.controller;

import com.example.employee.dto.ProjectDto;
import com.example.employee.entity.Project;
import com.example.employee.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
public class ProjectController
{
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService)
    {
        this.projectService=projectService;
    }
    @GetMapping("get")
    public ProjectDto getProjectById(@RequestParam int id)
    {
        return projectService.getProjectById(id);
    }
    @PostMapping("add")
    public String addProject(@RequestBody Project project)
    {
        return projectService.addProject(project);
    }
    @PutMapping("update")
    public String updateProjectById(@RequestParam int id,@RequestBody Project project)
    {
        return projectService.updateProjectById(id,project);
    }
    @DeleteMapping("delete")
    public String deleteProjectById(@RequestParam int id)
    {
        return projectService.deleteProjectById(id);
    }
}
