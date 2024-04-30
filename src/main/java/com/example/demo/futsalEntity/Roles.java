package com.example.demo.futsalEntity;

import jakarta.persistence.*;

@Entity
@Table(name="roles")

public class Roles {
    @GeneratedValue(generator = "roles_seq_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "roles_seq_gen",sequenceName = "roles_seq",allocationSize = 1)
    @Id
    private Integer id;
    @Column(name="role",nullable = false)
    private String role;
}
