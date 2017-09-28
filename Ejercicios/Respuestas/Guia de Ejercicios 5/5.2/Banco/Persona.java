package com.codoacodo;

class Persona {
    
    private String firstName;
    private double [] account = new double [2];
    private String [] passwords = new String [5];
    private int id;
    
    public Persona (String firstName, double pesos, double dolar, 
            String password) {
        this.firstName = firstName;
        this.account[0] = pesos;
        this.account[1] = dolar;
        this.passwords[0] = password;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public double getBalancePesos() {
        return this.account[0];
    }
    
    public double getBalanceDolar() {
        return this.account[1];
    }
    
    public void setBalance(double balance, int account) {
        switch (account) {
            case 0:
                this.account[0] = balance;
                break;
            case 1:
                this.account[1] = balance;
                break;
            default:
                this.account[0] = balance;
                break;
        }
    }
    
    public String toString() {
        return String.format("Account: %s\nBalance:\nAR$: %.2f\nUS$: %.2f\n",
                getFirstName(), getBalancePesos(), getBalanceDolar());
    }

    public String [] getPassword() {
        return this.passwords;
    }
    
    public String getKey(){
        return this.passwords[0].toString();
    }

    public int getId() {
        return this.id;
    }
}
