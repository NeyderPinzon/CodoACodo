package com.codoacodo;

public class TablaDeMultiplicar {

    public TablaDeMultiplicar() {
        
    }

    public void init(int indice) {
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",
                    indice, i, (indice * i));
        }
    }
    
}
