//package com.example.restapisession.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "passport")
//@Getter
//@Setter
//@NoArgsConstructor
//public class Passport {
//    @Id
//    @SequenceGenerator(name = "passport_gen",sequenceName = "passport_seq")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "passport_gen")
//    private Long id;
//
//    private String inn;
//
//    private String citizen;
//}