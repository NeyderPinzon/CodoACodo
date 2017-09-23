package com.codoacodo;

import java.util.Scanner;


public class Ahorcado {
    
    private String palabra;
    private char [] tabla;
    private int oportunidades;
    Scanner input = new Scanner(System.in);
    
    public Ahorcado (String palabra){
        this.palabra = palabra;
        this.oportunidades = 6;
    }
    
    public void jugar(){
        setting();
        do {
            
            System.out.print("Oportunidades: ");
            for (int x = this.oportunidades; x > 0; x--){
                System.out.print("♥ ");
            }
            
            System.out.println("");
            
            System.out.println("Adivina la palabra: ");
            String lt = input.next();
            adivina(lt.charAt(0));
            
            if (victoria()){
                System.out.println("Has ganado!");
                break;
            }
            
            if (this.oportunidades == 0){
                System.out.println("Has perdido!");
            }
        } while (this.oportunidades != 0);
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
            this.oportunidades--;
        }
        
        mostrarTabla();
    }
    
    private void mostrarTabla() {
        for (int i = 0; i < this.tabla.length; i++){
            System.out.print(this.tabla[i] + " ");
        }
        System.out.println("");
    }

    private boolean victoria() {
        boolean split = true;
        for (int i = 0; i < this.tabla.length; i++){
            if (this.tabla[i] == '_'){
                split = false;
                break;
            }
        }
        return split;
    }
    
}
