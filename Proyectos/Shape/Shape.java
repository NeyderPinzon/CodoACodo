package com.codoacodo.practice;

public class Shape {
    
    protected int sides;
    
    public Shape (int sides) {
        this.sides = sides;
    }
    
    protected int getSides(){
        return this.sides;
    }
    
    protected String getFamily(){
        return getClass().getSuperclass().getSimpleName();
    }
    
    protected String getName() {
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        return String.format("%s\n%s\nSides: %d",
                getName(), getFamily(), getSides()); 
    }   
}
