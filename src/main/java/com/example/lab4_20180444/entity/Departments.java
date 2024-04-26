package com.example.lab4_20180444.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private int department_id;

    @Column(name = "department_name", nullable = false)
    private String department_name;

    @Column(name = "manager_id")
    private int manager_id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location_id;
}
