package com.example.apiclima.service;

import org.springframework.stereotype.Service;
import com.example.apiclima.dto.MessageResponseDTO;
import com.example.apiclima.dto.request.PersonDTO;
import com.example.apiclima.entity.Person;
import com.example.apiclima.repository.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public MessageResponseDTO createPerson(PersonDTO personDTO){
        
        Person personToSave =  Person.builder()
        .firstName(personDTO.getFirstName())
        .lastName(personDTO.getLastName())
        .birthDay(personDTO.getBirthDate())
        .phones(personDTO.getPhones())
        .build();


        Person savedPerson = personRepository.save(personDTO);

        return MessageResponseDTO
            .builder()
            .message("created person with id " + savedPerson.getId())
            .build();
    }
    
}
