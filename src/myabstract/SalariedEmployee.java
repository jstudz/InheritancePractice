

package myabstract;

public class SalariedEmployee extends Employee{
    private int Salary;
    private int employeeID;
    private String name;

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
}
