package com.codoacodo;

public class Main {

    public static void main(String[] args) {
        
        Banco provincial = new Banco();
        Persona esteban = new Persona("Esteban Borai", 10500, 100, "admin");
        
        provincial.agregarCuenta(esteban);
        System.out.println(esteban.getBalancePesos());
        
        provincial.debit(esteban, 5500, 1);
        System.out.println(esteban.getBalancePesos());
        
        System.out.println(esteban.toString());
        
        System.out.println(provincial.getCurrentPassword(esteban));
        
        provincial.setNewPassword(esteban, "12345");
        System.out.println(provincial.getCurrentPassword(esteban));
        provincial.setNewPassword(esteban, "233");
        provincial.setNewPassword(esteban, "A23442");
        System.out.println(provincial.getCurrentPassword(esteban));
        
    }
    
}
