/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codoacodo;

/**
 *
 * @author alumno
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Database db = new Database("jdbc:mysql://localhost/","test","test","test");
           
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
