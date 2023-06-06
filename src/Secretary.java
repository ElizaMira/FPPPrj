package Inheritance;

public class Secretary extends DeptEmployee{
   private double overtimeHours;

   Secretary(String name,double salary,int aYear,int aMonth,int aDay,double overtimeHours)
   {
       super(name,salary,aYear,aMonth,aDay);
       this.overtimeHours=overtimeHours;
   }
   public double getOvertimeHours()
   {
       return overtimeHours;
   }
   public void setOvertimeHours(double overtimeHours)
   {
       this.overtimeHours=overtimeHours;
   }
   @Override
   public double computeSalary()
   {
       double salary=super.computeSalary();
       return (salary+12*overtimeHours);
   }
}
