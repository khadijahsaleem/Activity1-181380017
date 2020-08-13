public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    public HourlyEmployee(int empId, String empName, double taxRate , double hours , double hourlyRate) {
        super(empId, empName, taxRate);
        setHours(hours);
        setHourlyRate(hourlyRate);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

   
    public double calculateSalary() {
        double taxRate =0.0;
       double GrossPay = hours * hourlyRate;
       double Tax = GrossPay * taxRate;
       double Salary = GrossPay - Tax;
       return Salary;
    }
    public String toString()
    {
        
        return " Hourly Employee Salary : " + calculateSalary();
    }
}

