/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.bean;

import com.venta.dao.PersonaDAO;
import com.venta.model.Persona;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author erick
 */
@Named(value = "personaBean")
@SessionScoped
public class PersonaBean implements Serializable {

     private Persona persona = new Persona();
    
     
     
     
     public PersonaBean() {
     //this.persona = new Persona();
     }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
     
       public void registrar() {
        PersonaDAO dao;

        try {
            dao = new PersonaDAO();
            dao.registrar(persona);
            System.out.println("Record inseretd");
        } catch (Exception e) {
            System.err.println("Query faild");
            e.printStackTrace();
        }
    
}
       
}
