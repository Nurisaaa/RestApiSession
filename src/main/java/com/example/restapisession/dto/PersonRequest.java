package com.example.restapisession.dto;

import com.example.restapisession.validations.PhoneNumberValid;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Getter
@Setter
public class PersonRequest {

    private String fullName;
    @Email
    private String email;
    @Past
    private LocalDate dateOfBirth;
    @PhoneNumberValid
    private String phoneNumber;
    private String inn;
    private String citizen;
}
