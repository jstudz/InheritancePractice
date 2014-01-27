
package inheritancepractice;

import java.util.Scanner;
import myinterface.Employee;
import myinterface.HourlyEmployee;

public class InheritancePractice {

    public static void main(String[] args) {
        String name;
        int employeeID;
        int hoursWorked;
        int payRate;
        int totalPay;
        
        
        
        HourlyEmployee newEmployee = new HourlyEmployee();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter Employee's name:");
        name = keyboard.nextLine();
        newEmployee.setName(name);
        
        System.out.println("Please enter the Employee's ID number:");
        employeeID = keyboard.nextInt();
        newEmployee.setEmployeeID(employeeID);
        
        System.out.println("Please enter the hours worked for " + newEmployee.getName());
        hoursWorked = keyboard.nextInt();
        newEmployee.setHoursWorked(hoursWorked);
        
        System.out.println("Please enter the pay rate for " + newEmployee.getName());
        payRate = keyboard.nextInt();
        newEmployee.setPayRate(payRate); 
        
        System.out.println("Employee's name: " + newEmployee.getName());
        System.out.println("Employee's ID Number: " + newEmployee.getEmployeeID());
        System.out.println("Employee's pay rate: " + newEmployee.getPayRate());
        System.out.println("Employee's hours worked: " + newEmployee.getHoursWorked());
        System.out.println("Employee's total pay: " + newEmployee.getPay());
    }
    
    
}
