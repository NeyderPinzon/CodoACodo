package com.codoacodo;

import java.sql.*;
import javax.naming.*;
import java.util.*;

public class Database {

    private Connection connect;
    private Scanner input = new Scanner(System.in);
            
    public Database(String url, String pass, String base, String user)throws OperationNotSupportedException {
        connect = createConnection(url, base, user, pass);
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
    
    public void setup(){
        //Menu
        
        System.out.print("1. Create new entry\n2. Manage Passwords\n3. Display"
                + " Clients\n4. Delete Client\n-> ");
        int option = input.nextInt();
        
        do {
            switch (option){
                case 1:
                    loadNewUser();
                    break;
                case 2:
                    manageUserPassword();
                    break;
                case 3:
                    selectClients();
                    break;
                case 4:
                    deleteClient();
                    break;
                default:
                    System.out.println("Error Selection");
                    break;
            }
        } while (option > 4 || option < 1);
        
        selectClients();
    }

    private void selectClients(){
        
        System.out.println("====================================================");
        
        try {
            String query = "SELECT * FROM clients";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            System.out.format("%s  %s  %18s  %s  %s\n", 
                    "ID", "NAME", "COUNTRY", "PASSWORD", "PASSW_HIST");
            
            while (rs.next()) {
          
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String country = rs.getString("country");
                String password = rs.getString("password");
                int id = rs.getInt("id");
                
                System.out.format("%d - %s, %s - %s - %s\n", id, firstName, lastName,
                    country, password);
            }
            
            //connect.close();
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
        System.out.println("====================================================");
        setup();
    }
    
    private void loadNewUser() {
        
        String firstname, lastname, country, password;
        
        System.out.println("Load New User\n");
        System.out.print("First Name: ");
        firstname = input.next();
        System.out.print("Last Name: ");
        lastname = input.next();
        System.out.print("Country: ");
        country = input.next();
        System.out.print("Password: ");
        password = input.next();
        
        /*
        Check if password is repeated
        */
        
        insertClient(firstname, lastname, country, password);
        setup();
    }
    
    private boolean insertClient(String firstname, String lastname, String country,
            String password){
        
            try {
                StringBuilder query = new StringBuilder();
                //Insert
                query.append("INSERT INTO clients (");
                query.append("firstname, lastname, country, password)");
                //Values
                query.append("VALUES (\'" + firstname + "\', " + "\'" + lastname);
                query.append("\', " + "\'" + country + "\'," + "\'" + password + "\');");
            this.connect.createStatement().execute(query.toString());
            
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return false;
    }

    private void manageUserPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteClient() {

        System.out.print("Input client ID to delete: ");
        int delete = input.nextInt();
        
        try {
            
            String query = "DELETE FROM clients WHERE id=" + delete + ";";
            PreparedStatement deletion = connect.prepareStatement(query);
            deletion.execute();
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}