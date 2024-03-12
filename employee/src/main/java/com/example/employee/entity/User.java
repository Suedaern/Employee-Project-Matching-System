package com.example.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="kullanıcılar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    @Column(name="kullanıcı_id")
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "ad")
    private String userName;
    @Column(name = "soyad")
    private String userSurname;
}
