package Assignment5_Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getPayment() {
        return (baseSalary + (super.getGrossSales() * super.getCommissionRate()));
    }

    public String toString() {
        return "Employee [First Name:" + getFirstName() + ", Last Name:" + getLastName() + ", Social Security Number:" + getSocialSecurityNumber() + " ,Based Salary:" + baseSalary  + "]";
    }
}