/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectSena.StockWise.model;


//packages needed to work with the database; it allowes us to create the required table as an object.
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
    
    @Id
    @Column (name="ID User")
    private Long iduser;
    
    @Column (name="Nombre", nullable=false, length=20)
    private String nameuser;
    
    @Column (name="Apellido", nullable=false, length=25)
    private String lastnameuser;
    
    @Column (name="Correo Electronico", nullable=false, unique=true, length=40)
    private String email;

}