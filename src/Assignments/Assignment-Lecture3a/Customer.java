public class Customer {
    String firstName;
    String lastName;
    String socSecurityNum;

    Address billingAddress;
    Address shippingAddress;

    Customer(String firstName,String lastName,String socSecurityNum)
    {
        this.firstName =firstName;
        this.lastName=lastName;
        this.socSecurityNum=socSecurityNum;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public String getSocSecurityNum()
    {
        return getSocSecurityNum() ;
    }
    public void setFirstName (String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setSocSecurityNum(String socSecurityNum)
    {
        this.socSecurityNum=socSecurityNum;
    }
    public Address getBillingAddress()
    {
        return billingAddress;
    }
    public void setBillingAddress (Address billingAddress)
    {
        this.billingAddress=billingAddress;
    }
    public Address getShippingAddress()
    {
        return shippingAddress;
    }
    public void setShippingAddress(Address shippingAddress)
    {
        this.shippingAddress=shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Sam", "Smith", "S11111");
        Customer c2 = new Customer("Joe", "Doe", "S22222");
        Customer c3 = new Customer("Eric", "DD", "S33333");
        Address A1 = new Address("North Street", "Fairfield", "Iowa", "52557");
        Address A2 = new Address("South Street", "Fairfield", "Iowa", "52557");
        Address A3 = new Address("East Street", "Chicago", "Illinois", "12345");
        c1.setBillingAddress(A1);
        c1.setShippingAddress(A1);
        c2.setBillingAddress(A2);
        c2.setShippingAddress(A2);
        c3.setBillingAddress(A3);
        c3.setShippingAddress(A3);

        Customer[] CustomerList = new Customer[3];
        CustomerList[0] = c1;
        CustomerList[1] = c2;
        CustomerList[2] = c3;

        for (int i = 0; i < 3; i++) {
            if (CustomerList[i].getBillingAddress().getCity() == "Chicago") {
                System.out.println(CustomerList[i]);
            }
        }
    }
}


