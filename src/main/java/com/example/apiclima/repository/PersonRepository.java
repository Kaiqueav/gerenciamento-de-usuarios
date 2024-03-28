package com.example.apiclima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiclima.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long > {

}
