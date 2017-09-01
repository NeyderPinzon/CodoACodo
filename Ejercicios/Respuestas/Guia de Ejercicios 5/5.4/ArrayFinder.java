package com.netbeans;

import java.util.List;

class ArrayFinder {
    
    public void compare(List<String> array, List<String> array2){
        int big = (array.size() > array2.size()) ? array.size() : array2.size();
        for (int i = 0; i < big; i++){
            if (array2.contains(array.get(i))){
                System.out.printf("Match found at: %s\n",
                        array.get(i));
            }
        }
    }
}
