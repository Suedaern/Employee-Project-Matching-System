package com.example.employee.service;

import com.example.employee.dto.WorkTimeArchiveDto;
import com.example.employee.entity.WorkTimeArchive;
import com.example.employee.mapper.Mapper;
import com.example.employee.repository.WorkTimeArchiveRepository;
import com.example.employee.enums.MessagesEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkTimeArchiveServiceImpl implements WorkTimeArchiveService
{
    private final WorkTimeArchiveRepository workTimeArchiveRepository;

    @Autowired
    public WorkTimeArchiveServiceImpl(WorkTimeArchiveRepository workTimeArchiveRepository)
    {
        this.workTimeArchiveRepository=workTimeArchiveRepository;
    }
    @Override
    public WorkTimeArchiveDto getWorkTimeArchiveById(int id)
    {
        return Mapper.workTimeArchiveDtoMapper(workTimeArchiveRepository.findById(id).get());
    }
    @Override
    public String addWorkTimeArchive(WorkTimeArchive workTimeArchive)
    {
        workTimeArchiveRepository.save(workTimeArchive);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String updateWorkTimeArchive(int id,WorkTimeArchive workTimeArchive)
    {
        WorkTimeArchive wta = workTimeArchiveRepository.findById(id).get();

        if(workTimeArchive.getDate()!=null)
        {
            wta.setDate(workTimeArchive.getDate());
        }
        if(workTimeArchive.getReportId()!=0)
        {
            wta.setReportId(workTimeArchive.getReportId());
        }
        if(workTimeArchive.getWorkAmount()!=0)
        {
            wta.setWorkAmount(workTimeArchive.getWorkAmount());
        }
        workTimeArchiveRepository.save(wta);
        return MessagesEnum.successfullyUpdated.getValue();
    }
    @Override
    public String deleteWorkTimeArchiveById(int id)
    {
        workTimeArchiveRepository.deleteById(id);
        return MessagesEnum.successfullyDeleted.getValue();
    }
}
