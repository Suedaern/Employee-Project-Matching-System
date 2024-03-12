package com.example.employee.controller;

import com.example.employee.dto.ProjectDetailDto;
import com.example.employee.entity.ProjectDetail;
import com.example.employee.service.ProjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project_detail")
public class ProjectDetailController
{
   private final ProjectDetailService projectDetailService;

   @Autowired
    public ProjectDetailController(ProjectDetailService projectDetailService)
   {
       this.projectDetailService=projectDetailService;
   }
   @GetMapping("get")
    public ProjectDetailDto getProjectDetail(@RequestParam int id)
   {
       return projectDetailService.getProjectDetail(id);
   }
   @PostMapping("add")
    public String addProjectDetail(@RequestBody ProjectDetail projectDetail)
   {
       return projectDetailService.addProjectDetail(projectDetail);
   }
   @PutMapping("update")
    public String updateProjectDetail(@RequestParam int id, @RequestBody ProjectDetail projectDetail)
   {
       return projectDetailService.updateProjectDetail(id,projectDetail);
   }
   @DeleteMapping("delete")
    public String deleteProjectDetail(@RequestParam int id)
   {
       return projectDetailService.deleteProjectDetail(id);
   }
}
