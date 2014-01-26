
package inheritancepractice;

import java.util.Scanner;
import myinterface.Employee;
import myinterface.HourlyEmployee;

public class InheritancePractice {

    public static void main(String[] args) {
        String name;
        
        Employee newEmployee = new HourlyEmployee();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter Employee's name:");
        name = keyboard.nextLine();
        newEmployee.setName(name);
        
        System.out.println(newEmployee.getName());
    }
    
    
}
