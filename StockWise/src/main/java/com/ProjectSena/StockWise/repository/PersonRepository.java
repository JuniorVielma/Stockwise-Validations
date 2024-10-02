/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProjectSena.StockWise.repository;

import com.ProjectSena.StockWise.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jvielmav
 */

// We are declaring the JPA repository which will help us to handle the data in an easier way.
// this interface accepts 2 generic data; class entity and class type for the PK.
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
