

package myinterface;


public class HourlyEmployee implements Employee{
    private int payRate;
    private int hoursWorked;
    private String name;
    private int employeeID;

    //Class Methods
    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    //Interface Methods
    public String getName() {
            return name;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public int getPay() {
        return payRate * hoursWorked;
    }
}
    
    

