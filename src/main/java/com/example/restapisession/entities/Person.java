package com.example.restapisession.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "people")
public class Person {

    @Id
    @SequenceGenerator(name = "person_gen",sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "person_gen")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person",fetch = FetchType.EAGER)
    private List<Car> cars;

}
