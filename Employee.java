public abstract class Employee
        {
            private int empId;
            private String empName;
            private double taxRate;

            public Employee(int empId, String empName, double taxRate) {
                setEmpId(empId);
                setEmpName(empName);
                setTaxRate(taxRate);
            }

            public int getEmpId() {
                return empId;
            }

            public void setEmpId(int empId) {
                this.empId = empId;
            }

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
            }

            public double getTaxRate() {
                return taxRate;
            }

            public void setTaxRate(double taxRate) {
                this.taxRate = taxRate;
            }
            public abstract double  calculateSalary();
            
            public String toString()
            {
                return "Employee ID : " + getEmpId() + 
                        "Employee Name : " + getEmpName() + 
                        "Employee TaxRate : " + getTaxRate();
            }
        }