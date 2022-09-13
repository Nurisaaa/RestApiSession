package com.example.restapisession.api;

import com.example.restapisession.dto.requests.PersonRequest;
import com.example.restapisession.dto.requests.PersonResponse;
import com.example.restapisession.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public PersonResponse save(@RequestBody PersonRequest personRequest){
        return personService.save(personRequest);
    }
}
