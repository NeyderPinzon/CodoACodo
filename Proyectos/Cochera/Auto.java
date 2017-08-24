package com.codoacodo.practice;

public class Auto extends Vehiculo{

    public Auto(String patente) {
        super(patente);
    }

    @Override
    public String getPatente() {
        return this.patente;
    }

    @Override
    public int getRodaje() {
        return 4;
    }
    
}
