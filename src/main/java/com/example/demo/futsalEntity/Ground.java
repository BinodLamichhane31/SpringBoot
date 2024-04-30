package com.example.demo.futsalEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="grounds")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ground {
    @GeneratedValue(generator = "ground_seq_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="ground_seq_gen",sequenceName = "ground_seq",allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="Name",nullable = false)
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name="price(per hour)")
    private Double price;

}
