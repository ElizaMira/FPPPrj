package Inheritance;

public class Professor extends DeptEmployee{
    private int numberOfPublications;
    Professor(String name,double salary,int aYear,int aMonth,int aDay,int numberOfPublications)
    {
        super(name,salary,aYear,aMonth,aDay);
        this.numberOfPublications=numberOfPublications;

    }
    public int getNumberOfPublications()
    {
        return numberOfPublications;
    }
    public void setNumberOfPublications(int numberOfPublications)
    {
        this.numberOfPublications=numberOfPublications;
    }
}
