package com.codoacodo;

public class Main {

    public static void main(String[] args) {
        
        try {
            Database database = new Database("jdbc:mysql://localhost/", "admin", 
                    "accmanager", "root");
            database.setup();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
