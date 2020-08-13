public class RunEmployee {

    public static void main(String[] args) {
	 

        Employee[] emp = new Employee[6];

        SalariedEmployee s1 = new SalariedEmployee(5 , "Ahmed" , 40.0 , 10000.0);
        SalariedEmployee s2 = new SalariedEmployee(2 , "Umer" , 50.0 , 19000.0);

        HourlyEmployee h1 = new HourlyEmployee(3 , "Khadijah" , 60.0 , 10.5 , 100.0);
        HourlyEmployee h2 = new HourlyEmployee(4 , "Amir" , 70.0 , 15.0 , 150.0);

        CommissionedEmployee c1 = new CommissionedEmployee(4 , "Rubab" , 80.0 , 10000.0 , 500.0);
        CommissionedEmployee c2 = new CommissionedEmployee(6 , "Numan" , 90.0 , 15000.0 , 100.0);



        emp[0] = s1;
        emp[1] = s2;
        emp[2] = h1;
        emp[3] = h2;
        emp[4] = c1;
        emp[5] = c2;

        for (int i = 0 ; i < emp.length ; i++)
        {
            System.out.println();
            System.out.println(emp[i].toString());
        }
}
}