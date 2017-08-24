package com.codoacodo.practice;

import java.util.ArrayList;

public class Cochera {
    
    private ArrayList<Vehiculo> posiciones = new ArrayList<>(SIZE);
    private static final int SIZE = 10;
    
    public Cochera (){
        
    }
    
    public Ticket ocuparYFacturar(Vehiculo v){
        if (posiciones.size() < SIZE){
            posiciones.add(v);
            return new Ticket(v);
        } else {
            throw new ArrayIndexOutOfBoundsException("Full");
        }
    }
}
