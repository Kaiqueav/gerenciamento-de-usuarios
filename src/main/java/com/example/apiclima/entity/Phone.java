package com.example.apiclima.entity;
import com.example.apiclima.enums.PhoneType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class Phone {
    private Long id;
    private PhoneType type;
    private String number;

}
