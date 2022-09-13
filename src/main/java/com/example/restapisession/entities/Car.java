package com.example.restapisession.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_gen")
    private Long id;
    private String model;
    private String colour;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE})
    private Person person;
}
