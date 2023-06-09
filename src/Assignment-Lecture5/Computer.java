package Assignment5_Problem5;

import java.util.Comparator;
import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;
    Computer(String manufacturer,String processor,int ramSize,double processorSpeed)
    {
        this.manufacturer=manufacturer;
        this.processor=processor;
        this.ramSize=ramSize;
        this.processorSpeed=processorSpeed;
    }
    int getRamSize()
    {
        return ramSize;
    }
    double getProcessorSpeed()
    {
        return processorSpeed;
    }
    double getComputePower()
    {
        return (ramSize*processorSpeed);
    }

    @Override
    public String toString() {
        return "{Manufacturer='" + manufacturer + '\'' +
                ", Processor='" + processor + '\'' +
                ", RamSize=" + ramSize +
                ", Processor Speed=" + processorSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && Double.compare(computer.processorSpeed, processorSpeed) == 0 && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    public static void main(String[] args)
{
    Computer C1=new Computer("Microsoft","Intel",128,3.5);
    Computer C2=new Computer("Microsoft","Intel",128,3.5);
    Computer C3=new Computer("Microsoft","Intel",256,4.5);
    System.out.println("Computer 1:" +C1.toString());
    System.out.println("Computer 2:" +C2.toString());
    System.out.println("Computer 3:" +C3.toString());
    if (C1.equals(C2))
    {
        System.out.println("Computer 1 and Computer 2 are Equal");
    }
    else {
        System.out.println("Computer 1 and Computer 2 are not Equal");
    }
    if (C1.equals(C3))
    {
        System.out.println("Computer 1 and Computer 3 are Equal");
    }
    else {
        System.out.println("Computer 1 and Computer 3 are not Equal");
    }
    System.out.println("Computer C1 hash code"+C1.hashCode());
    System.out.println("Computer C2 hash code"+C2.hashCode());
    System.out.println("Computer C3 hash code"+C3.hashCode());

   if (C1.hashCode()==C2.hashCode())
   {
       System.out.println("Computer 1 and Computer 2 have equal hash Code");
   }
   else {
       System.out.println("Computer 1 and Computer 2 do not have equal hash code");
   }
    if (C1.hashCode()==C3.hashCode())
    {
        System.out.println("Computer 1 and Computer 3 have equal hash Code");
    }
    else {
        System.out.println("Computer 1 and Computer 3 do not have equal hash code");
    }
}

}
