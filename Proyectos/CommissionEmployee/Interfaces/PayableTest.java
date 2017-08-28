package com.codoacodo;

public class PayableTest {

    public static void main(String[] args) {
        Payable [] payableObjects = new Payable[4];
        
        payableObjects[0] = new Invoice ("0001", "PlayStation Pro", 1, 499.0);
        payableObjects[1] = new Invoice ("0002", "Xbox One X", 1, 599.0);
        payableObjects[2] = 
                new SalariedEmployee("Esteban", "Borai", "1130929", 1700.0);
        payableObjects[3] = 
                new SalariedEmployee("Paulina", "Zambrano", "478299", 1900.0);
        
        for (Payable currentPayable : payableObjects){
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "Payment Due: ", currentPayable.getPaymentAmmount());
        }  
    }
}
