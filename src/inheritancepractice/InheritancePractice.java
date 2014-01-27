
package inheritancepractice;

import java.util.HashSet;
import java.util.Scanner;
//import myinterface.HourlyEmployee;
import my.concrete.HourlyEmployee;
import my.concrete.SalariedEmployee;
import my.concrete.SalaryPlusComissionEmployee;

public class InheritancePractice {

    public static void main(String[] args) {
        String name;
        int employeeID;
        int hoursWorked;
        int payRate;
        int totalPay;
        int salary;
        int totalSales;
        int commissionRate;
        
        
        
        HourlyEmployee newEmployee = new HourlyEmployee();
        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.println("Please enter Employee's name:");
//        name = keyboard.nextLine();
//        newEmployee.setName(name);
//        
//        System.out.println("Please enter the Employee's ID number:");
//        employeeID = keyboard.nextInt();
//        newEmployee.setEmployeeID(employeeID);
//        
//        System.out.println("Please enter the hours worked for " + newEmployee.getName());
//        hoursWorked = keyboard.nextInt();
//        newEmployee.setHoursWorked(hoursWorked);
//        
//        System.out.println("Please enter the pay rate for " + newEmployee.getName());
//        payRate = keyboard.nextInt();
//        newEmployee.setPayRate(payRate); 
//        
//        System.out.println("Employee's name: " + newEmployee.getName());
//        System.out.println("Employee's ID Number: " + newEmployee.getEmployeeID());
//        System.out.println("Employee's pay rate: $" + newEmployee.getPayRate());
//        System.out.println("Employee's hours worked: " + newEmployee.getHoursWorked());
//        System.out.println("Employee's total pay: $" + newEmployee.getPay());
        
        
//        SalariedEmployee salaryEmployee = new SalariedEmployee();
//        
//        System.out.println("Please enter Employee's name:");
//        name = keyboard.nextLine();
//        salaryEmployee.setName(name);
//        
//        System.out.println("Please enter the Employee's ID number:");
//        employeeID = keyboard.nextInt();
//        salaryEmployee.setEmployeeID(employeeID);
//        
//        System.out.println("Please enter the salary for " + salaryEmployee.getName());
//        salary = keyboard.nextInt();
//        salaryEmployee.setSalary(salary);
//   
//        System.out.println("Employee's name: " + salaryEmployee.getName());
//        System.out.println("Employee's ID Number: " + salaryEmployee.getEmployeeID());
//        System.out.println("Employee's Salary: $" + salaryEmployee.getSalary());
        
        SalaryPlusComissionEmployee commissionEmployee = new SalaryPlusComissionEmployee();
        
        System.out.println("Please enter Employee's name:");
        name = keyboard.nextLine();
        commissionEmployee.setName(name);
        
        System.out.println("Please enter the Employee's ID number:");
        employeeID = keyboard.nextInt();
        commissionEmployee.setEmployeeID(employeeID);
        
        System.out.println("Please enter the salary for " + commissionEmployee.getName());
        salary = keyboard.nextInt();
        commissionEmployee.setSalary(salary);
        
        System.out.println("Please enter the total sales for: " + commissionEmployee.getName());
        totalSales = keyboard.nextInt();
        commissionEmployee.setTotalSales(totalSales);
        
        System.out.println("Please enter the commission percentage for: " + commissionEmployee.getName());
        commissionRate = keyboard.nextInt();
        commissionEmployee.setCommissionPercentage(commissionRate);
        
   
        System.out.println("Employee's name: " + commissionEmployee.getName());
        System.out.println("Employee's ID Number: " + commissionEmployee.getEmployeeID());
        System.out.println("Employee's Salary: $" + commissionEmployee.getSalary());
        System.out.println("Employee's total sales: $" + commissionEmployee.getTotalSales());
        System.out.println("Employee's commission rate: $" + commissionEmployee.getCommissionPercentage());
        System.out.println("Employee's total pay: $" + commissionEmployee.getPay());
        
    }
    
    
}
