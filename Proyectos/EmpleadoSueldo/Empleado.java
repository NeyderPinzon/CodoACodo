package com.codoacodo;

public class Empleado {
    
    private int horasTrabajadas;
    private int antiguedad;
    private final int JORNADA_BASICA = 160;
    
    public Empleado (int horasTrabajadas, int antiguedad) {
        
        this.horasTrabajadas = horasTrabajadas;
        this.antiguedad = antiguedad;
        
    }
    
    private double retencion (double sueldo) {
        if (sueldo <= 18000){
            return sueldo * 0.80;
        } else {
            return sueldo * 0.76;
        }
    }
    
    private double calcAntiguedad () {
        int anos = this.antiguedad / 5;
        int resto = this.antiguedad % 5;
        return ((anos * 800) + (resto * 300));
    }
    
    public double sueldoNeto(){
        double sueldo;
        if (this.horasTrabajadas <= JORNADA_BASICA){
            sueldo = (this.horasTrabajadas * 120);
        } else {
            int horasExtras = this.horasTrabajadas - JORNADA_BASICA;
            sueldo = (JORNADA_BASICA * 120) + (horasExtras * 150);
        }
        return sueldo;
    }
    
    public double getSueldo(){
        double sueldo = sueldoNeto();
        sueldo += calcAntiguedad();
        return retencion(sueldo);
    }
}
