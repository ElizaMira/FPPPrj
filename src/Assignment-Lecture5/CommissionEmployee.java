package Assignment5_Problem4;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;
    CommissionEmployee(String firstName,String lastName,String SSN,double grossSales,double commissionRate)
    {
        super(firstName,lastName,SSN);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public double getGrossSales()
    {
        return grossSales;
    }
    public double getCommissionRate()
    {
        return commissionRate/100;
    }
    public double getPayment()
    {
        return(grossSales*commissionRate/100);
    }


    public String toString() {
        return "Employee [First Name:" + getFirstName() + ", Last Name:" + getLastName() + ", Social Security Number:" + getSocialSecurityNumber() + " ,Gross Sales:" + grossSales +" ,Commission Rate:"+commissionRate+"]";
    }

}
