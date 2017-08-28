package com.codoacodo;

public class CommissionEmployee extends Employee {
    
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    private void setGrossSales(double grossSales) {
        if (grossSales >= 0.0){
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException(
                "Gross sales must be greather than 0.0");
        }
    }

    private void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0 && commissionRate < 1.0){
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException(
                "Commission rate must be between (0.0, 1.0)");
        }
    }

    @Override
    double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    private double getCommissionRate() {
        return this.commissionRate;
    }

    private double getGrossSales() {
        return this.grossSales;
    }
    
    public String toString() {
        return String.format("%s \n%s $%,.2f\n%s %,.2f", 
            super.toString(), "Gross Sales", getGrossSales(),
            "Commission Rate", getCommissionRate());
    }
}
