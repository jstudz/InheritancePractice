

package my.concrete;


public class SalaryPlusComissionEmployee extends Employee {
    private int salary;
    private int commission;
    private int totalSales;
    private int commissionPercentage;

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
