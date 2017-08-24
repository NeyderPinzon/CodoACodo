package com.codoacodo.practice;

class Paciente {
    
    private String firstName;
    private String lastName;
    private int age;
    
    public Paciente (String firstName, String lastName, int age){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getAge() {
        return this.age;
    }
}
