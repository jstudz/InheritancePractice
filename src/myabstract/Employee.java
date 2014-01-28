

package myabstract;

public abstract class Employee {
    private String name;
    private int employeeID;
    
    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getEmployeeID();

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    
}
