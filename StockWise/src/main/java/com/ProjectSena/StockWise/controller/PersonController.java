/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectSena.StockWise.controller;

import com.ProjectSena.StockWise.model.Person;
import com.ProjectSena.StockWise.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jvielmav
 */

@RestController
@RequestMapping("/person")

public class PersonController {
    
    @Autowired
    private PersonService personservice;
    
    
    // Creating a new record in our DB.
    @PostMapping("/new")
    public Person newPerson (@RequestBody Person person){
    
        return this.personservice.newPerson(person);
    }
    
    // Showing a record in our DB.
    @GetMapping("/show")
    public Iterable<Person> getAll(){
    
        return personservice.getAll();
    }
    
    // Modifying a record in our DB.
    @PostMapping("/modify")
    public Person updatePerson(@RequestBody Person person){
    
        return this.personservice.modifyPerson(person);
    }
    
    // Removing a record in our DB.
    @PostMapping(value="/{id}")
    public Boolean deletePerson(@PathVariable (value="id") Long id){
        
        return this.personservice.deletePerson(id);
    }
}
