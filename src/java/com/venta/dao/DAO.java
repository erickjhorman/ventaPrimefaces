package com.venta.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    public static final String url = "jdbc:mysql://localhost:3306/ventajava?user=root&password=";

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url);
            System.out.println("Database is connected");
        } catch (Exception e) {
            System.err.println("Database connected failed:");
            e.printStackTrace();
        }

    }
    
    public void cerrar(){
        try {
            if(cn != null){
                if(cn.isClosed() == false){
                    cn.close();
                }
            }
        } catch (Exception e) {
        }
    }

}
