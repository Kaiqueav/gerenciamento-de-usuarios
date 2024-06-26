package com.example.apiclima.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    NOME("Nome"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");


    private final  String description;
}
