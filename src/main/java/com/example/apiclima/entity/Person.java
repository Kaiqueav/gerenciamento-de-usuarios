package com.example.apiclima.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data


public class Person {
    private String firstName;
    private String lastName;
    private int cpf;
    private LocalDate birthDay;
}
