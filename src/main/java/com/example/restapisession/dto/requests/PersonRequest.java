package com.example.restapisession.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PersonRequest {
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;
}
