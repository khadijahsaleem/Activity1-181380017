public class CommissionedEmployee extends Employee{
    private double sales;
    private double commissionRate;

    public CommissionedEmployee(int empId, String empName, double taxRate ,double sales , double commissionRate) {
        super(empId, empName, taxRate);
        setSales(sales);
        setCommissionRate(commissionRate);
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

   
    public double calculateSalary() {
        double GrossPay = sales * commissionRate;
        double taxRate = 0.0;
        double Tax = GrossPay * taxRate;
        double  Salary = GrossPay - Tax;
        return Salary;
    }
    public String toString()
    {
        
        return "Commissioned Employee Salary : " + calculateSalary();
    }
}