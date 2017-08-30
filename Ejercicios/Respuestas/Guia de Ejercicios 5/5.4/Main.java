package com.codoacodo;

public class Main {

    public static void main(String[] args) {
        String [] uno = {"Un", "caballo", "corre", "en", "la", "pradera"};
        String [] dos = {"Un", "ocelote", "se", "comio", "al", "caballo",
            "que", "corre"};
        String [] tres = {"El", "ocelote", "es", "gran", "animal"};
        
        ArrayFinder find = new ArrayFinder();
        find.compare(uno, dos, tres);
    }
    
}
