package com.codoacodo;

public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber,
            double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }
    
    public String toString() {
        return String.format("Salaried Employee: %s \n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
    
    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary > 0.0){
            this.weeklySalary = weeklySalary;
        } else {
            throw new IllegalArgumentException(
                "Weekly Salary must be >= 0.0");
        }
    }
    
    public double getWeeklySalary (){
        return this.weeklySalary;
    }
    
    
    @Override
    public double getPaymentAmmount() {
        return getWeeklySalary();
    }

    @Override
    double earnings() {
        return getWeeklySalary();
    }
}
