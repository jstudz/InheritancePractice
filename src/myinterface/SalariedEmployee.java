

package myinterface;

public class SalariedEmployee implements Employee{
    private int salary;
    
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
        
  }
    
  public void setEmployeeID(int employeeNum) {
      
  }

    //Class Methods
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
  
}
