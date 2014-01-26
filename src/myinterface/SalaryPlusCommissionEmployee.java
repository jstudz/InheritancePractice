

package myinterface;

public class SalaryPlusCommissionEmployee implements Employee{
   private int totalPay;
   private int salary;
   private int commission;
   private int totalSales;
   private int commissionPercentage;
   
   
   //Interface Methods
   public int getPay() {
        return totalPay;
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

    public int getCommission() {
        commission = totalSales * commissionPercentage;
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public int getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(int commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
   
   
}
