package com.codoacodo.gjallarhorn;

public class Main {

    public static void main(String[] args) {
        
        try {
            //(String url, String pass, String base, String user)
            Database db = new Database("jdbc:mysql://localhost/","1234","hellojava","esteban");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
