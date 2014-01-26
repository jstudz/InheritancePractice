
package inheritancepractice;

import myinterface.Employee;
import myinterface.HourlyEmployee;

public class InheritancePractice {

    public static void main(String[] args) {
        Employee newEmployee = new HourlyEmployee();
        
        
        System.out.println(newEmployee.getName());
    }
    
}
