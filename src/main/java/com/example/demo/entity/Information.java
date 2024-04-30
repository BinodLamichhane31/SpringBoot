package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "informations")


public class Information {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;
    @Column(name="name",nullable = false,length = 100)
    private String name;
    @Column(name="age",nullable = false,length = 10)
    private String age;

}



