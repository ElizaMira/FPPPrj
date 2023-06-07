package Assignment5_Problem4;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    SalariedEmployee (String firstName,String lastName,String SSN,double weeklySalary)
    {
        super(firstName,lastName,SSN);
        this.weeklySalary=weeklySalary;
    }

    public double getPayment()
    {
        return weeklySalary;
    }

    public String toString() {
        return "Employee [First Name:" + getFirstName() + ", Last Name:" + getLastName() + ", Social Security Number:" + getSocialSecurityNumber() + ", Weekly Salary:" + weeklySalary + "]";
    }
}
