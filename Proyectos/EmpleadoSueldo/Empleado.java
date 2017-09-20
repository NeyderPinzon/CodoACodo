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
        double quinq = 0, anos = this.antiguedad, meses = 0;
        quinq = (((int) anos / 5) * 800);
        meses = (((anos / 5) % 1) * 10);
        
        //System.out.println("MESES: " + (int) meses);
        return quinq;
    }
    
    public double sueldoBruto() {
        double sueldo = 0;
        int anosAntiguedad = this.antiguedad * 800;
        int horasExtras = JORNADA_BASICA - this.horasTrabajadas;
        
        if (this.horasTrabajadas <= JORNADA_BASICA){
            //Jornada Basica
            sueldo = (this.horasTrabajadas * 120);
            sueldo += anosAntiguedad;
        } else {
            //Horas extras
            sueldo = ((JORNADA_BASICA * 120) + (horasExtras * 150));
            sueldo += anosAntiguedad;
        }
        
        sueldo = retencion(sueldo);
        
        System.out.println("Antiguedad\n" + calcAntiguedad());
        
        return sueldo + calcAntiguedad();
    }
}
