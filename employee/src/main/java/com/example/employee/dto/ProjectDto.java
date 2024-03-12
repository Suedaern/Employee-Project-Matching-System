package com.example.employee.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDto
{
    private String projectName;
    private UserDto projectManagerDto;
    private List<ProjectAssignmentDto> assignmentList;
    private ProjectDetailDto projectDetailDto;
    public ProjectDto(Builder builder)
    {
        this.projectName=builder.projectName;
        this.projectManagerDto = builder.projectManagerDto;
        this.assignmentList= builder.assignmentList;
        this.projectDetailDto=builder.projectDetailDto;
    }
    @NoArgsConstructor
    public static class Builder
    {
        public List<ProjectAssignmentDto> assignmentList;
        private String projectName;
        private UserDto projectManagerDto;
        private ProjectDetailDto projectDetailDto;


        public Builder projectName(final String projectName)
        {
            this.projectName=projectName;
            return this;
        }
        public Builder projectManagerDto(final UserDto projectManagerDto)
        {
            this.projectManagerDto=projectManagerDto;
            return this;
        }
        public Builder assignmentList(final List<ProjectAssignmentDto> assignmentList)
        {
            this.assignmentList=assignmentList;
            return this;
        }
        public Builder projectDetail(final ProjectDetailDto projectDetailDto)
        {
            this.projectDetailDto=projectDetailDto;
            return  this;
        }

        public ProjectDto build()
        {
            return new ProjectDto(this);
        }
    }
}
