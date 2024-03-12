package com.example.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Table(name = "calisma_bilgileri")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkTimeArchive
{
    @Column(name = "calisma_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int archiveId;

    @Column(name = "calisma_gunu")
    private Date date;

    @Column(name = "a_id")
    private int reportId;

    @Column(name = "calisma_suresi")
    private int workAmount;
}
