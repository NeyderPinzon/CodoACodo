package com.codoacodo.practice;

import java.util.Random;

public class SensorHumedad {
    
    private Random random = new Random();
    
    public SensorHumedad(){
        random.setSeed(System.currentTimeMillis());
    }
    
    public int getHumedad(){
        return random.nextInt(50);
    }
}
