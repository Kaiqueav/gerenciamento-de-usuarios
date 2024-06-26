package com.example.apiclima.controller;
import com.example.apiclima.dto.MessageResponseDTO;
import com.example.apiclima.dto.request.PersonDTO;

import com.example.apiclima.service.PersonService;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;
  
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Validated PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }   

   
}
