package com.example.restapisession.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonResponse {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
}
