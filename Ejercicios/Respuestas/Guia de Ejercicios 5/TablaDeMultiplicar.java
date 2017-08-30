package com.codoacodo;

public class TablaDeMultiplicar {

    private int indice;
    
    public TablaDeMultiplicar(int indice) {
        setIndice(indice);
    }

    public void init() {
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",
                    getIndice(), i, (getIndice() * i));
        }
    }
    
    private void setIndice(int indice){
        if (indice > 0){
            this.indice = indice;
        } else {
            throw new IllegalArgumentException(
                "Indice debe ser mayor a 0!");
        }
    }
    
    private int getIndice(){
        return this.indice;
    }
    
    
}
