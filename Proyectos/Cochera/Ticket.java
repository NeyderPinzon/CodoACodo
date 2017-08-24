package com.codoacodo.practice;

import java.util.Date;

public class Ticket {
    
    private double tarifa;
    private Date fechaYHora;
    private String patente;
    
    public Ticket(Vehiculo v) {
        this.tarifa = (v.getRodaje() == 2) ? (double) 10 : (double) 15;
        this.fechaYHora = new Date();
        this.patente = v.getPatente();
    }
    
    public double getTarifa(){
        return this.tarifa;
    }
    
    public Date getFechaYHora(){
        return this.fechaYHora;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public void imprimir(){
        System.out.printf("%s\n%s\n%s: %s\n%s: %.1f\n\n", "PARKING LOT",
                getFechaYHora(), "Patente", getPatente(), "Tarifa", getTarifa());
    }
    
}
