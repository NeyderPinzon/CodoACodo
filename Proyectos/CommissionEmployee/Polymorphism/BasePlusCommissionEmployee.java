package com.codoacodo;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee (String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double commissionRate,
            double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
        
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0){
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException(
                "Base salary must be greater than or equal to 0.0");
        }
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    @Override
    double earnings() {
        return getBaseSalary() * super.earnings();
    }
    
    @Override
    public String toString() {
        return String.format("%s\n%s $%,.2f",
                super.toString(), "Base Salary", getBaseSalary());
    }
}
