package com.example.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "projeler")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project
{
    @Column(name = "proje_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    @ManyToOne
    @JoinColumn(name = "sorumlu_kullanıcı_id")
    private User projectManager;

    @Column(name = "proje_adı")
    private String projectName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "atama_id")
    private List<ProjectAssignment> projectAssignmentList;

    @OneToOne
    @JoinColumn(name = "project_detail_id")
    private ProjectDetail projectDetail;

}
