package com.example.lab4_20180444.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private int employee_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "hire_date", nullable = false)
    private Date hire_date;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Jobs job_id;

    @Column(name = "salary")
    private float salary;

    @Column(name = "commission_pct")
    private float commission_pct;

    @Column(name = "manager_id")
    private int manager_id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department_id;

    @Column(name = "enabled")
    private int enabled;


}
