package com.example.restapisession.repositories;

import com.example.restapisession.dto.PersonResponse;
import com.example.restapisession.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select new com.example.restapisession.dto.PersonResponse(" +
            "p.id," +
            "concat(p.firstName,' ',p.lastName)," +
            "p.email," +
            "p.phoneNumber) from Person p where p.id = ?1")
    Optional<PersonResponse> getPersonById(Long id);

    @Query("select new com.example.restapisession.dto.PersonResponse(" +
            "p.id," +
            "concat(p.firstName,' ',p.lastName)," +
            "p.email," +
            "p.phoneNumber) from Person p")
    List<PersonResponse> getAllPeople();
}