package com.codoacodo.practice;

public class Main {

    public static void main(String[] args) {
        Hospital c = new Hospital();
        //Crear Pacientes
        Ficha a = new Ficha("Esteban", "Borai", 21, "Addiction to Code", "Nothing");
        Ficha b = new Ficha("Leonardo", "Magnante", 44, "Nothing", "Nothing");
        Ficha d = new Ficha("Maria", "Angarita", 18, "Nothing", "Nothing");
        
        //Mostrar Pacientes
        c.agregarPaciente(a);
        c.agregarPaciente(b);
        c.agregarPaciente(d);
        
        //Mostrar todos los Pacientes
        c.mostrarPacientes();
    }
    
}
