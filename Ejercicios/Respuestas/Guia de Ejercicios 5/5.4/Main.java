package com.netbeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<String> uno = new ArrayList<>(Arrays.asList("xyz", "abc"));
        List<String> dos = new ArrayList<>(Arrays.asList("xyz", "cba"));

        ArrayFinder find = new ArrayFinder();
        find.compare(uno, dos);
    }
    
}
