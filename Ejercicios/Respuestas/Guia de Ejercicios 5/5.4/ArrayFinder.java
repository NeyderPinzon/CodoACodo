package com.codoacodo;

import java.util.ArrayList;

class ArrayFinder {
    
    public void compare(String [] array, String  [] array2){
        if (checkArray(array) && checkArray(array2)){
            for (int a = 0; a < array.length; a++){
                String current = array[a];
                for (int b = 0; b < array2.length; b++){
                    if (current.equals(array2[b])){
                        System.out.printf("Array 1: [%d] - Array 2: [%d] - Found Equal at:"
                                + "%s\n", a,
                                b, array[a]);
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(
                "Array lenght should be greather than 0!");
        }
    }
    
    public void compare(String [] array, String  [] array2, String [] array3){
        if ((checkArray(array) && checkArray(array2)) && checkArray(array3)){
            
            ArrayList<String> iguales = new ArrayList<String>();
            iguales.contains();
            for (int a = 0; a < array.length; a++){
                String current = array[a];
                for (int b = 0; b < array2.length; b++){
                    if (current.equals(array2[b])){
                        iguales.add(current);
                    }
                }
            }
            
            //check third
            
            if (iguales.size() > array3.length){
                for (int i = 0; i < iguales.size(); i++){
                    String current = iguales.get(i);
                    for (int x = 0; x < array3.length; x++){
                        if (current.equals(array3[x])){
                            System.out.printf(
                            "Equals: [%d] - Array 3: [%d] - Found Equal at: %s\n",
                            i, x, array3[x]);
                        }
                    }
                }
            } else {
                for (int i = 0; i < array3.length; i++){
                    String current = array3[i];
                    for (int x = 0; x < iguales.size(); x++){
                        if (current.equals(iguales.get(x))){
                            System.out.printf(
                            "Equals: [%d] - Array 3: [%d] - Found Equal at: %s\n",
                            i, x, iguales.get(x));
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(
                "Array lenght should be greather than 0!");
        }
    }
    
    private boolean checkArray(String [] array){
        if (array.length > 0){
            return true;
        } else {
            return false;
        }
    }
}
