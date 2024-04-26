package com.example.lab4_20180444.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", nullable = false)
    private int location_id;

    @Column(name = "street_address")
    private String street_address;

    @Column(name = "postal_code")
    private String postal_code;

    @Column(name = "city")
    private String city;

    @Column(name = "state_province")
    private String state_province;

    @Column(name = "country_id")
    private String country_id;
}
