package com.example.jsonpostgres.controllers;


import com.example.jsonpostgres.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private  final static Logger logger = LoggerFactory.getLogger(PersonController.class);
    private PersonRepository personRepository;
   @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("json")
    public void json(){

       this.getClass().getResource("");

    }
}
