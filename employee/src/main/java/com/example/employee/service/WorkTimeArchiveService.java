package com.example.employee.service;

import com.example.employee.dto.WorkTimeArchiveDto;
import com.example.employee.entity.WorkTimeArchive;

public interface WorkTimeArchiveService
{
    WorkTimeArchiveDto getWorkTimeArchiveById(int id);
    String addWorkTimeArchive(WorkTimeArchive workTimeArchive);
    String updateWorkTimeArchive(int id,WorkTimeArchive workTimeArchive);
    String deleteWorkTimeArchiveById(int id);


}
