package com.codoacodo;

public class PayrollSystemTest {

    public static void main(String[] args) {
        
        Employee[] employees = new Employee [4];
        //Polymorphism
        employees[0] = new SalariedEmployee("Esteban", "Borai", "123-123-123", 3.280);
        employees[1] = new HourlyEmployee("Esteban", "Borai", "321-AA-321", 5.3, 120);
        employees[2] = new CommissionEmployee("Esteban", "Borai", "718-19A", 5003.50, 0.6);
        employees[3] = new BasePlusCommissionEmployee("Esteban", "Borai", "2268-199", 5003.50, 0.8, 980.50);
        
        for (Employee thisEmployee : employees){
            
            System.out.println(thisEmployee);
            
            if (thisEmployee instanceof BasePlusCommissionEmployee){
                
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) thisEmployee;
                
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New Base Salary with 10%% increase is: $%,.2f\n",
                    employee.getBaseSalary());
                
            }
            
            System.out.printf("Earned $%,.2f\n\n", thisEmployee.earnings());
            
        }
        
        for (int i = 0; i < employees.length; i++){
            System.out.printf("Employee %d is a %s\n", i, 
                    employees[i].getClass().getSimpleName());
        }
            
    }
    
}
