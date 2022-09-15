package com.example.restapisession.services;

import com.example.restapisession.dto.PersonRequest;
import com.example.restapisession.dto.PersonResponse;
import com.example.restapisession.entities.Person;
import com.example.restapisession.exceptions.NotFoundException;
import com.example.restapisession.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonResponse save(PersonRequest personRequest) {
        Person person = new Person();
        String[] arr = personRequest.getFullName().split(" ", 2);
        person.setFirstName(arr[0]);
        person.setLastName(arr[1]);
        person.setEmail(personRequest.getEmail());
        person.setAge(Period.between(personRequest.getDateOfBirth(), LocalDate.now()).getYears());
        person.setPhoneNumber(personRequest.getPhoneNumber());

//        Passport passport = new Passport();
//        passport.setCitizen(personRequest.getCitizen());
//        passport.setInn(personRequest.getInn());

//        person.setPassport(passport);
        Person person1 = personRepository.save(person);
        return new PersonResponse(person1.getId(),
                person1.getFirstName() + " " + person1.getLastName(),
                person1.getEmail(),
                person1.getPhoneNumber());
    }

    public PersonResponse getById(Long id) {
        return personRepository.getPersonById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Person with id = %s not found",id)));
    }

    public List<PersonResponse> getAllPeople(){
        return personRepository.getAllPeople();
    }
}
