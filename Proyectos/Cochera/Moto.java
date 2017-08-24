package com.codoacodo.practice;

public class Moto extends Vehiculo {
    
    public Moto (String patente){
        super(patente);
    }
    
    @Override
    public String getPatente(){
        return this.patente;
    }
    
    @Override
    public int getRodaje(){
        return 2;
    }
}
