/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codoacodo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.OperationNotSupportedException;

/**
 *
 * @author alumno
 */
public class Database {

    private Connection conexion;
            
    public Database(String url, String pass, String base, String user)throws OperationNotSupportedException {
         conexion = createConnection(url, base, user, pass);
    }

    
    
    private boolean createTable(String nombre, String atributos) {
        try {
            
            String query = "create table " + nombre + "(" + atributos + ")";
            this.conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean insertData(String tabla, String atributos, String valores){
            try {
            
            String query = "insert into " + tabla + "(" + atributos + ") values("+ valores+")";
            this.conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean deleteTable(String nombre) {
        try {
            
            String query = "drop table " + nombre;
            conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private Connection createConnection(String url, String base, String user, String pass) throws OperationNotSupportedException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url + base,
                    user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new OperationNotSupportedException("ERROR de conexion");
    }
}
