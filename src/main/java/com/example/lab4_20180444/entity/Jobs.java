package com.example.lab4_20180444.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", nullable = false)
    private String job_id;

    @Column(name = "job_title", nullable = false)
    private String job_title;

    @Column(name = "min_salary")
    private int min_salary;

    @Column(name = "max_salary")
    private int max_salary;
}
