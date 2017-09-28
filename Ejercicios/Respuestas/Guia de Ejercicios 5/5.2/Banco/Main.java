package com.codoacodo;

import java.util.ArrayList;
import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) throws OperationNotSupportedException {
        
        ArrayList<Persona> accounts = new ArrayList<>();
        
        Persona p = new Persona("Qwerty1", 20029, 29, "12345");
        Persona p1 = new Persona("Qwerty2", 20029, 29, "12345");
        Persona p2 = new Persona("Qwerty3", 20029, 29, "12345");
        Persona p3 = new Persona("Qwerty4", 20029, 29, "12345");
        Persona p4 = new Persona("Qwerty5", 20029, 29, "12345");
        Persona p5 = new Persona("Qwerty6", 20029, 29, "12345");
        
        accounts.add(p);
        accounts.add(p1);
        accounts.add(p2);
        accounts.add(p3);
        accounts.add(p4);
        
        Banco bank = new Banco(accounts);
    }
    
}
