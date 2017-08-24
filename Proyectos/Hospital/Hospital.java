package com.codoacodo.practice;

import java.util.ArrayList;

public class Hospital {
    
    private ArrayList<Ficha> pacientes = new ArrayList<>();
    
    public Hospital(){
        
    }

    public void mostrarPacientes(){
        for (Ficha f : pacientes){
            System.out.println(f.toString());
        }
    }

    void agregarPaciente(Ficha f) {
        pacientes.add(f);
    }
}
