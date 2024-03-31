package com.example.apiclima.dto.request;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneDTO> phones;

}
