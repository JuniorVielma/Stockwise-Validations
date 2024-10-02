/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectSena.StockWise.services;

import com.ProjectSena.StockWise.model.Person;
import com.ProjectSena.StockWise.repository.PersonRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jvielmav
 */

//This class is used to implemet the methods exposed in the PersonService file such as:
//Create, find, remove and modify.

@Service
public class PersonServiceImplement implements PersonService{
    @Autowired
    private PersonRepository personrepository;
    

    @Override
    public Person newPerson(Person newPerson) {
        return personrepository.save(newPerson);
    }

    @Override
    public Iterable<Person> getAll() {
        return this.personrepository.findAll();
    }

    @Override
    public Boolean deletePerson(Long IdUser) {
       
        
        if(this.personrepository.existsById(IdUser) == true){
            
            this.personrepository.deleteById(IdUser);
            return true;
        }
            
        return false;
        
    }

     @Override
    public Person modifyPerson(Person person) {
       
        
        Optional<Person> personFound = this.personrepository.findById(person.getIduser());
        if(personFound.get() != null){
            
            personFound.get().setNameuser(person.getNameuser());
            personFound.get().setLastnameuser(person.getLastnameuser());
            personFound.get().setEmail(person.getEmail());
            return this.newPerson(personFound.get());
        }
        
        return null;
    }
    
    
}
