package com.example.employee.controller;

import com.example.employee.dto.WorkTimeArchiveDto;
import com.example.employee.entity.WorkTimeArchive;
import com.example.employee.service.WorkTimeArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("workTimeArchive")
public class WorkTimeArchiveController
{
    private final WorkTimeArchiveService workTimeArchiveService;

    @Autowired
    public WorkTimeArchiveController(WorkTimeArchiveService workTimeArchiveService)
    {
        this.workTimeArchiveService=workTimeArchiveService;
    }
    @GetMapping("get")
    public WorkTimeArchiveDto getWorkTimeArchiveById(@RequestParam int id)
    {
        return workTimeArchiveService.getWorkTimeArchiveById(id);
    }
    @PostMapping("add")
    public String addWorkTimeArchive(@RequestBody WorkTimeArchive workTimeArchive)
    {
        return workTimeArchiveService.addWorkTimeArchive(workTimeArchive);
    }
    @PutMapping("update")
    public String updateWorkTimeArchiveById(@RequestParam int id, @RequestBody WorkTimeArchive workTimeArchive)
    {
        return workTimeArchiveService.updateWorkTimeArchive(id,workTimeArchive);
    }
    @DeleteMapping("delete")
    public String deleteWorkTimeArchiveById(@RequestParam int id)
    {
        return workTimeArchiveService.deleteWorkTimeArchiveById(id);
    }
}
