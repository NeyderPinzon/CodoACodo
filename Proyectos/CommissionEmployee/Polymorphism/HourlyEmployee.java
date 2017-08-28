package com.codoacodo;

public class HourlyEmployee extends Employee {
    
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    private void setWage(double wage) {
        if (wage >= 0.0){
            this.wage = wage;
        } else {
            throw new IllegalArgumentException(
                "Hourly Wage should be greather than 0.0!");
        }
    }

    private void setHours(int hours) {
        if (hours >= 0.0){
            this.hours = hours;
        } else {
            throw new IllegalArgumentException(
                "Hours should be greather than 0.0!");
        }
    }
    
    double getHours(){
        return this.hours;
    }
    
    double getWage(){
        return this.wage;
    }

    @Override
    double earnings() {
        if (getHours() <= 40){
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    
    public String toString(){
        return String.format("%s\n%s%,.2f\n%s%,.2f\n",
                super.toString(), "Hours: ", getHours(), "Wage/Hours: ",
                getWage());
    }
    
}
