package com.codoacodo;

import java.util.ArrayList;

class ArrayFinder {
    
    ArrayList<String> iguales = new ArrayList<String>();
    
    public void compare(ArrayList<String> array, ArrayList<String> array2){
        for (int i = 0; i < array.size(); i++){
            if (array2.contains(array.get(i))){
                System.out.printf("Match found at: %s\n",
                        array.get(i));
            }
        }
    }
}
