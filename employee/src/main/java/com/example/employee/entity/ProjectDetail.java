package com.example.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetail
{
    @Column(name = "id")
    @Id
    private int id;

    @OneToOne(mappedBy = "projectDetail")
    private Project project;

    @Column(name = "detail")
    private String detail;
}
