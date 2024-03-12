package com.example.employee.controller;

import com.example.employee.dto.ProjectAssignmentDto;
import com.example.employee.entity.ProjectAssignment;
import com.example.employee.service.ProjectAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projectAssignment")
public class ProjectAssignmentController
{
    private final ProjectAssignmentService projectAssignmentService;

    @Autowired
    public ProjectAssignmentController(ProjectAssignmentService projectAssignmentService)
    {
        this.projectAssignmentService=projectAssignmentService;
    }

    @GetMapping("get")
    public ProjectAssignmentDto getProjectAssignmentById(@RequestParam int id)
    {
        return projectAssignmentService.getProjectAssignmentById(id);
    }
    @PostMapping("add")
    public String addProjectAssignment(@RequestBody ProjectAssignment projectAssignment)
    {
        return projectAssignmentService.addProjectAssignment(projectAssignment);
    }
    @PutMapping("update")
    public String apdateProjectAssignmentById(@RequestParam int id, @RequestBody ProjectAssignment projectAssignment)
    {
        return projectAssignmentService.updateProjectAssignmentById(id,projectAssignment);
    }
    @DeleteMapping("delete")
    public String deleteProjectAssignmentById(@RequestParam int id)
    {
        return projectAssignmentService.deleteProjectAssignment(id);
    }
}
