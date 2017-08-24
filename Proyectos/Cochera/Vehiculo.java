package com.codoacodo.practice;

abstract class Vehiculo {
    
    public int rodaje;
    public String patente;
    
    public Vehiculo(String patente){
        this.patente = patente;
    }
    
    public abstract String getPatente();
    public abstract int getRodaje();

}
