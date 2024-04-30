package com.example.demo.futsalEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @GeneratedValue(generator = "user_seq_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="user_seq_gen",sequenceName = "user_seq",allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="user_name",nullable = false,length = 50)
    private String username;

    @Column(name="password",nullable = false,length = 20)
    private String password;

    @Column(name="phone",nullable=false,length = 10)
    private String phone;

    @Column(name="email",nullable = false,length = 50)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            foreignKey = @ForeignKey(name = "fk_role_user_id"),
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "fk_roles_role_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_user_role_user_id",
                    columnNames = {"role_id", "user_id"})
    )
    private Collection<Roles> roles;



}



