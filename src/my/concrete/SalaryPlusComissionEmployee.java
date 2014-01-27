

package my.concrete;


public class SalaryPlusComissionEmployee extends Employee {
    private int salary;
    private int commission;
    private int totalSales;
    private int commissionPercentage;
    private int pay;

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
        commissionPercentage = commissionPercentage / 100;
        return commissionPercentage;
    }

    public void setCommissionPercentage(int commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
    
    public int getPay() {
        pay = commission + salary;
        return pay;
    }
    
    
}
