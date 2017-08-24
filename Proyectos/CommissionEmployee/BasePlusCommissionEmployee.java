package com.codoacodo.practice;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, double commissionRate,
            double salary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        this.baseSalary = salary;
    }
    
    public void setBaseSalary(double salary){
        if (salary >= 0.0){
            this.baseSalary = salary;
        } else {
            throw new IllegalArgumentException("Base Salary Must Be >= 0.0");
        }
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    @Override
    public double earnings(){
        return this.baseSalary + (getCommissionRate() * getGrossSales());
    }
    
    @Override
    public String toString(){
        return String.format("Base-Salaried Commission Employee: %s %s\n"
                + "Social Security Number: %s\nGross Sales: %.2f\nCommission Rate: %.2f\n"
                + "Base Salary: %.2f", getFirstName(), getLastName(), getSocialSecurityNumber(),
                getGrossSales(), getCommissionRate(), getBaseSalary());
    }
}
