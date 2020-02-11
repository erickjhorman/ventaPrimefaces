/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.dao;

import com.venta.model.Persona;
import java.sql.PreparedStatement;

/**
 *
 * @author erick
 */
public class PersonaDAO extends DAO{
    
    public void registrar (Persona per){
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO persona (nombre, sexo) values(?,?)");
            st.setString(1, per.getNombre());
            st.setString(2, per.getSexo());
            st.executeUpdate();
              System.out.println("Inserted satisfactorily");
            
        } catch (Exception e) {
            System.err.println("Query faild:");
            e.printStackTrace();
        } finally{
            this.cerrar();
        }
    }
    
    
    
}
