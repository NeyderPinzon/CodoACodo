package com.codoacodo;

import java.sql.*;
import java.util.*;
import javax.naming.*;

public class Database {

    private Connection connect;
    private final String URL = "jdbc:mysql://localhost/";
    private final String DATABASE = "customers";
    private final String USERNAME = "admin01";
    private final String PASSWORD = "admin";
    private final String TABLE_DB = "Customers";
            
    public Database() throws OperationNotSupportedException {
        connect = createConnection(URL, DATABASE, USERNAME, PASSWORD);
    }

    private Connection createConnection(String url, String base, String user, String pass) 
        throws OperationNotSupportedException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url + base, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new OperationNotSupportedException("Error de Conexion con Base de Datos");
    }

    public void displayTable(){
        System.out.println("====================================================");
        
        try {
            String query = "SELECT * FROM " + TABLE_DB;
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            System.out.format("%20s|%15s|%15s|%15s|%15s\n", "Name",
                        "AC_PESOS", "AC_DOLAR", "KEY", "OLD_KEYS");
            System.out.println("----------------------------------------------------");
            /*
+-----------------+-----------+-----------+------------------------------+------------------+---------+
| first_name      | acc_pesos | acc_dolar | user_key                     | old_keys         | user_id |
+-----------------+-----------+-----------+------------------------------+------------------+---------+
| Esteban Borai   |      10.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |       1 |
+-----------------+-----------+-----------+------------------------------+------------------+---------+
            */
            while (rs.next()) {
                
                String firstName = rs.getString("first_name");
                double accPesos = rs.getDouble("acc_pesos");
                double accDolar = rs.getDouble("acc_dolar");
                String userKey = rs.getString("user_key");
                String oldKeys = rs.getString("old_keys");
                int userId = rs.getInt("user_id");
                
                System.out.format("%20s|%15.2f$|%15.2f$|%15s|%15s|%10d\n", firstName,
                        accPesos, accDolar, userKey, oldKeys, userId);
                System.out.println("----------------------------------------------------");
            }
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
        System.out.println("====================================================");
    }
    
    public void insertPersonas(ArrayList<Persona> personas){
        for (int i = 0; i < personas.size(); i++){
            try {
                String query = "INSERT INTO " + TABLE_DB + "("
                    + "first_name, acc_pesos, acc_dolar, user_key)"
                    + "VALUES (\'" + personas.get(i).getFirstName() + "\',"
                    + personas.get(i).getBalancePesos() + ","
                    + personas.get(i).getBalanceDolar() + ","
                    + "\'" + personas.get(i).getKey() + "\');";
                this.connect.createStatement().execute(query.toString());
         
            
            } catch (Exception e) {
            
                System.err.printf("insertPersonas(%d)ERROR\n", i);
                System.err.println(e.getMessage());
            }
        }
    }
    
    public void insertPersonas(Persona p){
        try {
                String query = "INSERT INTO " + TABLE_DB + "("
                    + "first_name, acc_pesos, acc_dolar, user_key)"
                    + "VALUES (\'" + p.getFirstName() + "\',"
                    + p.getBalancePesos() + ","
                    + p.getBalanceDolar() + ","
                    + "\'" + p.getKey() + "\');";
                this.connect.createStatement().execute(query.toString());
                
            
            } catch (Exception e) {
            
                System.err.print("insertPersonas()ERROR\n");
                System.err.println(e.getMessage());
        }
    }
    
    public void modifyData(int code, Persona p, double newBalance){
        try {
                String query = "UPDATE " + TABLE_DB
                    + "SET id = " + p.getId() + "("
                    + newBalance + ")";
                this.connect.createStatement().execute(query.toString());
         
            
            } catch (Exception e) {
            
                System.err.printf("modifyData(%d)ERROR\n",
                        newBalance);
                System.err.println(e.getMessage());
        }
    }
}
