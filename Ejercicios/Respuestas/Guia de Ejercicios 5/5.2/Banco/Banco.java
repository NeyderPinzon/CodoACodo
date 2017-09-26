package com.codoacodo;

import java.util.ArrayList;

public class Banco {
    
    ArrayList<Persona> accounts = new ArrayList<>();
    
    public Banco () {
        
    }
    
    public void agregarCuenta (Persona p){
        this.accounts.add(p);
    }
    
    public void credit (Persona p, double amount, int account){
        switch (account) {
            case 0:
                p.setBalance((p.getBalancePesos() + amount), 0);
                break;
            case 1:
                p.setBalance((p.getBalanceDolar() + amount), 1);
                break;
            default:
                p.setBalance((p.getBalancePesos() + amount), 0);
                break;
        }
    }
    
    public void debit (Persona p, double amount, int account) {
        switch (account) {
            case 0:
                double currentBalance = p.getBalancePesos();
                if (amount < currentBalance) {
                    p.setBalance((p.getBalancePesos() - amount), 0);
                } else {
                    try {
                        throw new BalanceAmmountExcedeed("Excedded");
                    } catch (BalanceAmmountExcedeed ex) {
                        System.out.println(ex.getMessage());
                    }       
                }
                break;
            case 1:
                
            default:
                p.setBalance((p.getBalancePesos() + amount), 0);
                break;
        }
    }
    
    public String getCurrentPassword(Persona p){
        
        String [] passwords = p.getPassword();
        String lastPassword = "";
        
        for (int i = 0; i < passwords.length; i++){
            if (passwords[i] != null){
                lastPassword = passwords[i];
            } else {
                continue;
            }
        }
        
        return lastPassword;
    }
    
    private boolean validatePassword(String password){
        
        boolean valid = false;
        
        if (password.length() >= 5){
            valid = true;
        }
        
        return valid;
    }
    
    public void setNewPassword(Persona p, String newPassword){
        
        String [] passwords = p.getPassword();
        boolean notEquals = true;
        
        if (validatePassword(newPassword)){
            
            for (int u = 0; u < passwords.length; u++){
                if (passwords[u] != null && passwords[u].equals(newPassword)){
                    notEquals = false;
                }
            }
        
            if (notEquals) {
            
                for (int i = 0; i < passwords.length; i++){
                    if (passwords[i] == null){
                        passwords[i] = newPassword;
                        break;
                    }
                }
            
            } else {
                System.out.println("The new password already exists");
            }
        } else {
            System.out.println("Password isnt valid!");
        }
    }
}
