package com.example.employee.service;

import com.example.employee.mapper.Mapper;
import com.example.employee.dto.ProjectDetailDto;
import com.example.employee.entity.ProjectDetail;
import com.example.employee.enums.MessagesEnum;
import com.example.employee.repository.ProjectDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDetailServiceImpl implements ProjectDetailService
{
    private final ProjectDetailRepository projectDetailRepository;

    @Autowired
    public ProjectDetailServiceImpl(ProjectDetailRepository projectDetailRepository)
    {
        this.projectDetailRepository=projectDetailRepository;
    }
    @Override
    public ProjectDetailDto getProjectDetail(int id)
    {
        return Mapper.projectDetailMapper(projectDetailRepository.findById(id).get());
    }
    @Override
    public String addProjectDetail(ProjectDetail projectDetail)
    {
        projectDetailRepository.save(projectDetail);
        return MessagesEnum.successfullyAdded.getValue();
    }
    @Override
    public String updateProjectDetail(int id, ProjectDetail projectDetail)
    {
        ProjectDetail pd=projectDetailRepository.findById(id).get();

        pd.setDetail(projectDetail.getDetail());
        projectDetailRepository.save(pd);

        return MessagesEnum.successfullyUpdated.getValue();
    }
    @Override
    public String deleteProjectDetail(int id)
    {
        projectDetailRepository.deleteById(id);
        return MessagesEnum.successfullyDeleted.getValue();
    }
}
