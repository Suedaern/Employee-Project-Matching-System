package com.example.employee.mapper;

import com.example.employee.dto.*;
import com.example.employee.entity.*;
import java.util.ArrayList;
import java.util.List;

public class Mapper
{
    public static ProjectDto projectDtoMapperWithoutAssignmentList(Project project)
    {
        return new ProjectDto.Builder()
                .projectName(project.getProjectName())
                .projectManagerDto(userDtoMapper(project.getProjectManager()))
                .build();
    }
    public static ProjectAssignmentDto projectAssignmentDtoMapper(ProjectAssignment projectAssignment)
    {
        return new ProjectAssignmentDto.Builder()
                .userDto(userDtoMapper(projectAssignment.getUser()))
                .projectDto((projectDtoMapperWithoutAssignmentList(projectAssignment.getProject())))
                .build();
    }

    public static ProjectAssignmentDto projectAssignmentDtoMapperWithoutProject(ProjectAssignment projectAssignment)
    {
        return new ProjectAssignmentDto.Builder()
                .userDto(userDtoMapper(projectAssignment.getUser()))
                .build();
    }

    public static ProjectDetailDto projectDetailMapper(ProjectDetail projectDetail)
    {

        return new ProjectDetailDto.Builder()
                .detail(projectDetail.getDetail())
                .projectDto(projectDtoMapperWithoutAssignmentList(projectDetail.getProject()))
                .build();
    }

    public static List<ProjectAssignmentDto> projectAssignmentDtoListMapper(List<ProjectAssignment> projectAssignmentList)
    {
        List<ProjectAssignmentDto> pAssignmentDtoList = new ArrayList<>();

        projectAssignmentList.forEach((n)-> pAssignmentDtoList.add(projectAssignmentDtoMapperWithoutProject(n)));
        return pAssignmentDtoList;
    }
    public static UserDto userDtoMapper(User user)
    {
        return new UserDto.Builder()
                .userName(user.getUserName())
                .userSurname(user.getUserSurname())
                .build();
    }
    public static ProjectDto projectDtoMapper(Project project)
    {
        return new ProjectDto.Builder()
                .projectName(project.getProjectName())
                .projectManagerDto(userDtoMapper(project.getProjectManager()))
                .assignmentList(projectAssignmentDtoListMapper(project.getProjectAssignmentList()))
                .projectDetail(projectDetailMapper(project.getProjectDetail()))
                .build();
    }

    public static WorkTimeArchiveDto workTimeArchiveDtoMapper(WorkTimeArchive workTimeArchive)
    {
        return new WorkTimeArchiveDto.Builder()
                .setValues(workTimeArchive.getReportId(),
                        workTimeArchive.getDate(),
                        workTimeArchive.getWorkAmount())
                .build();
    }
}
