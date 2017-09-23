package com.codoacodo;

import java.util.Scanner;


public class Ahorcado {
    
    private String palabra;
    private char [] tabla;
    Scanner input = new Scanner(System.in);
    
    public Ahorcado (String palabra){
        this.palabra = palabra;
    }
    
    public void jugar(){
        setting();
        for (int i = 1; i <= 6; i++){
            
            System.out.print("Oportunidades: ");
            for (int x = 6; x > 0; x--){
                System.out.print("♥ ");
            }
            
            System.out.println("");
            
            if (i == 1){
                mostrarTabla();
            }
            
            System.out.println("Adivina la palabra: ");
            String lt = input.next();
            adivina(lt.charAt(0));
        }
    }
    
    private void setting() {
        this.palabra = this.palabra.toUpperCase();
        this.tabla = new char [this.palabra.length()];
        for (int i = 0; i < this.palabra.length(); i++){
            this.tabla[i] = '_';
        }
    }
    
    public void adivina(char a){
        a = Character.toUpperCase(a);
        boolean resolvio = false;
        char [] letras = this.palabra.toCharArray();
        for (int i = 0; i < letras.length; i++){
            if (letras[i] == a){
                this.tabla[i] = a;
                resolvio = true;
            }
        }
        
        if (resolvio == false) {
            System.out.printf("Letra %c no existe en la palabra\n",
                    a);
        }
        
        mostrarTabla();
    }
    
    private void mostrarTabla() {
        for (int i = 0; i < this.tabla.length; i++){
            System.out.print(this.tabla[i] + " ");
        }
        System.out.println("");
    }
    
}
