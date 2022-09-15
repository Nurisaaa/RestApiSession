package com.example.restapisession.api;

import com.example.restapisession.dto.PersonRequest;
import com.example.restapisession.dto.PersonResponse;
import com.example.restapisession.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/people")
public class PersonApi {

    private final PersonService personService;

    @GetMapping("/{id}")
    public PersonResponse getById(@PathVariable Long id){
       return personService.getById(id);
    }

    @PostMapping
    public PersonResponse save(@RequestBody @Valid PersonRequest personRequest){
        return personService.save(personRequest);
    }

    @GetMapping
    public List<PersonResponse> getAll(){
        return personService.getAllPeople();
    }
}
