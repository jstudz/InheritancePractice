

package myinterface;


public class HourlyEmployee implements Employee {
    private int hourlyWage;
    private int hoursWorked;

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public String getName() {
            return name;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmployeeID(int employeeNum) {
       this.employeeID = employeeID;
    }
}
    
    

