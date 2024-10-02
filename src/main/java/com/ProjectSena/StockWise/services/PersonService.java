/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProjectSena.StockWise.services;

import com.ProjectSena.StockWise.model.Person;

/**
 *
 * @author jvielmav
 */

//We are declaring the methods will be implemented in the person implement class.
public interface PersonService {
    
    Person newPerson(Person newPerson);
    Iterable<Person> getAll();
    Person modifyPerson (Person person);
    Boolean deletePerson (Long IdUser);
}
