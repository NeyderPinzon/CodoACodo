package com.codoacodo.practice;

import java.util.Random;

public class Planta {
    
    private String nombre;
    private int hidratacion;
    
    public Planta (String nombre) {
        this.nombre = nombre;
        this.hidratacion = new Random().nextInt(20);
    }
    
    public int getHidratacion(){
        return this.hidratacion;
    }
    
    public void regarPlanta() throws HumedadAltaException{
        if (getHidratacion() < 8){
            SensorHumedad s = new SensorHumedad();
            if (s.getHumedad() < 25){
            } else {
                throw new HumedadAltaException("Humedad es muy alta");
            }
        }
    }

    boolean mostrarStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
