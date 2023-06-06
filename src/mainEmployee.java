package Inheritance;

import java.util.Scanner;

public class mainEmployee {

    public static void main(String args[]) {
        double TotalSalary = 0.0;
        DeptEmployee P1 = new Professor("Michael", 30000, 1970, 10, 12, 5);
        DeptEmployee P2 = new Professor("Eric", 40000, 1971, 05, 01, 9);
        DeptEmployee P3 = new Professor("Jorge", 50000, 1972, 02, 02, 7);

        DeptEmployee S1 = new Secretary("Mary", 1000, 1980, 01, 01, 5);
        DeptEmployee S2 = new Secretary("Rose", 2000, 1981, 02, 15, 10);

        DeptEmployee[] deptEmployees = new DeptEmployee[5];
        deptEmployees[0] = P1;
        deptEmployees[1] = P2;
        deptEmployees[2] = P3;
        deptEmployees[3] = S1;
        deptEmployees[4] = S2;

       
            Scanner sc=new Scanner(System.in);
            System.out.println("Do you wish to see the sum of all Professor and Secretary(Y/N)");
            String input=sc.nextLine() ;
            if (input.equals("Y"))
            {
                for(DeptEmployee DE:deptEmployees)
                {

                    System.out.println("The  salary "+DE.computeSalary());
                 TotalSalary+= DE.computeSalary();

            }
                System.out.println("The sum of salary "+TotalSalary);

        }
    }






}
