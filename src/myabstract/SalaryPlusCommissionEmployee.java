

package myabstract;

public class SalaryPlusCommissionEmployee extends Employee{
    private int salary;
    private int commissionRate;
    private int sales;
    private int employeeID;
    private String name;
    private String address;
    private int annualPay;

    public int calcAnnualPay() {
        return annualPay;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    
    //Abstract Class methods
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
