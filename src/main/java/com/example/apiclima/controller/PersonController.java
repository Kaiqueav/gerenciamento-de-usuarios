package com.example.apiclima.controller;
import com.example.apiclima.dto.MessageResponseDTO;
import com.example.apiclima.entity.Person;
import com.example.apiclima.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;
  
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }   

   
}
