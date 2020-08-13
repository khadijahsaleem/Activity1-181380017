public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(int empId, String empName, double taxRate , double salary) {
        super(empId, empName, taxRate);
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        double Salary;
        double taxRate = 0.0;
        Salary = salary - (salary * taxRate);
        return Salary;
    }
    public String toString()
    {
        return  " Salaried Employee Salary : " + calculateSalary();
        
    }
}