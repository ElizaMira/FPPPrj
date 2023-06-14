package Assignment8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Marketing {
    private String employeename;
    private String productname;
    private double salesamount;

    Marketing(String employeename,String productname,double salesamount)
    {
        this.employeename=employeename;
        this.productname=productname;
        this.salesamount=salesamount;

    }



public String getEmployeename()
    {
        return employeename;
    }
    public String getProductname()
    {
        return productname;
    }
    public double getSalesamount()
    {
        return salesamount;
    }
    public String toString()
    {
        return "Employee Name: "+employeename+" ,Product Name: "+productname+" ,Sales Amount: "+salesamount+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesamount, salesamount) == 0 && Objects.equals(employeename, marketing.employeename) && Objects.equals(productname, marketing.productname);
    }


}
