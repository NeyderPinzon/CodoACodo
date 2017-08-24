package com.codoacodo.practice;

public class Main {

    public static void main(String[] args) {
        Cochera c = new Cochera();
        c.ocuparYFacturar(new Auto("423-98A")).imprimir();
        c.ocuparYFacturar(new Moto("267-91S")).imprimir();
        c.ocuparYFacturar(new Auto("527-M0T")).imprimir();
    }
    
}
