package com.example.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atamalar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAssignment
{
    @Column(name = "atama_id")
    @Id
    private int reportId;

    @ManyToOne
    @JoinColumn(name="p_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "k_id")
    private User user;
}
