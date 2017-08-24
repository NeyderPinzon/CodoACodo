package com.codoacodo.practice;

public class Square extends Parallelogram {
    
    protected int sides = getSides();
    
    public Square(double sides){
        super(sides, sides);
        //Square sides are the same lenght
    }
    
}
