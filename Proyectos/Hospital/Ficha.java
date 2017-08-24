package com.codoacodo.practice;

public class Ficha extends Paciente{
    
    private String enfermedad;
    private String remedio;
    
    public Ficha (String firstName, String lastName, int age, String enfermedad,
            String remedio){
        
        super(firstName, lastName, age);
        
        this.enfermedad = enfermedad;
        this.remedio = remedio;
        
    }
    
    public String getEnfermedad(){
        return this.enfermedad;
    }
    
    public String getRemedio(){
        return this.remedio;
    }
    
    @Override
    public String toString(){
        return String.format("Paciente: %s, %s (%d)\nEnfermedad: %s\nRemedio: %s\n",
                getFirstName(), getLastName(), getAge(), getEnfermedad(), getRemedio());
    }
}
