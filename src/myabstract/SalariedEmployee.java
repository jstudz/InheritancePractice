

package myabstract;

public class SalariedEmployee extends Employee{
    private int Salary;
    private int employeeID;
    private String name;
    private String address;
    private int annualPay;

    @Override
    public int calcAnnualPay() {
        return annualPay;
    }
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    //Abstract class methods
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
