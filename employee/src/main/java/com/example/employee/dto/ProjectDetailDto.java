package com.example.employee.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDetailDto
{
    private  String detail;
    private ProjectDto projectDto;

    public ProjectDetailDto(Builder builder)
    {
        this.detail=builder.detail;
        this.projectDto=builder.projectDto;
    }
    @NoArgsConstructor
    public static class Builder
    {
        private String detail;
        private ProjectDto projectDto;

        public Builder detail(final String detail)
        {
            this.detail=detail;
            return this;
        }
        public Builder projectDto(final ProjectDto projectDto)
        {
            this.projectDto=projectDto;
            return this;
        }
        public ProjectDetailDto build()
        {
            return new ProjectDetailDto(this);
        }
    }

}
