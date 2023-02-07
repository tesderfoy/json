package com.example.jsonpostgres.repositories;

import com.example.jsonpostgres.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface  PersonRepository extends CrudRepository<Person, Integer> {
}
