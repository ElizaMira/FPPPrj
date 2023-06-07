package Assignment5_Problem4;

public class EmployeeMain {


    public static void main(String[] args)
    {
        double TotalSalary=0.0;
        Employee E1=new CommissionEmployee("David","White","S1234-01",2000.10,10);
        Employee E2=new CommissionEmployee("Steven","Red","S4567-01",5000.20,15);
        Employee E3=new HourlyEmployee("Nancy","Orange","S2337-01",3000,12);
        Employee E4=new SalariedEmployee("Lily","Purple","S6677-01",1000.0);
        Employee E5=new BasePlusCommissionEmployee("Jessi","Blue","S8899-01",4000,5,1000);

        Employee[] Em=new Employee[5];
        Em[0]=E1;
        Em[1]=E2;
        Em[2]=E3;
        Em[3]=E4;
        Em[4]=E5;


        for(Employee E:Em )
        {

            TotalSalary+=E.getPayment();
            System.out.println(E);
        }
        System.out.println("Total Salary payment of the employees :"+TotalSalary);



    }


}
