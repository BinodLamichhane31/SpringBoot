package com.example.demo.entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Collection;

@Entity
@Table(name="contexts")

public class Context {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="context_name",nullable = false,length = 100)
    private String name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="information_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="fk_contexts_information_id"))
//    private Information information;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "context_information",
            foreignKey = @ForeignKey(name = "fk_informations_context_id"),
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "fk_informations_information_id"),
            inverseJoinColumns = @JoinColumn(name = "information_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_contexts_information_context_id",
                    columnNames = {"information_id", "context_id"})
    )
    private Collection<Information> informations;


}
