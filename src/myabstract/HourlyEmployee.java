

package myabstract;

public class HourlyEmployee extends Employee{
    private int payRate;
    private int hoursWorked;

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
    
    
}
