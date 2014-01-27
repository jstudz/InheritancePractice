

package myinterface;

public class SalariedEmployee implements Employee{
    private int salary;
    private String name;
    private int employeeID;
    
  //Interface Methods
  public int getPay() {
       return salary;  
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

    //Class Methods
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
  
}
