package com.codoacodo.practice;

public class Parallelogram extends Quadrilaterals {
    
    protected double sideA;
    protected double sideB;
    
    public Parallelogram (double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    protected double getSideA(){
        return this.sideA;
    }
    
    protected double getSideB(){
        return this.sideB;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n%s\nSides: %d\nSide A: %.1f\nSide B: %.1f\n",
                getName(), getFamily(), getSides(), getSideA(), getSideB());
    }
}
