

package myabstract;

public class HourlyEmployee extends Employee{
    private int payRate;
    private int hoursWorked;
    private String name;
    private int employeeID;
    private String address;

    
    @Override
    public int calcAnnualPay() {
        return (payRate * hoursWorked) * 52;
    }
    
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

  public String getName() {
      return name;
  }
  
  public void setName(String name)
  {
      this.name = name;
  }
  
  public int getEmployeeID() {
      return employeeID;
  }
  
  public void setEmployeeID(int employeeID) {
      this.employeeID = employeeID;
  }
 
  public void setAddress (String address) {
      this.address = address;
  }
  
  public String getAddress() {
      return address;
  }
}
