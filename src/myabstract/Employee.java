

package myabstract;

public abstract class Employee {
    private String name;
    private int employeeID;
    
    public String getName() {
        return name;
    }

    public abstract void setName(String name);

    public int getEmployeeID() {
        return employeeID;
    };

    public abstract void setEmployeeID(int employeeID);
    
    
}
