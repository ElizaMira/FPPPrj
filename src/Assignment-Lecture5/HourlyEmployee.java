package Assignment5_Problem4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    HourlyEmployee(String firstName,String lastName,String SSN,double wage,double hours)
    {
        super(firstName,lastName,SSN);
        this.wage=wage;
        this.hours=hours;
    }

    public double getPayment()
    {
        return(wage*hours);

    }
    public String toString() {
        return "Employee [First Name:" + getFirstName() + ", Last Name:" + getLastName() + ", Social Security Number:" + getSocialSecurityNumber() + ", Wage:" + wage + ", Hours:" + hours + "]";
    }
}
