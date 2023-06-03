import java.util.Stack;

public class Cube {
    int length = 1;
    int width = 2;
    int height = 3;

    //Constructor
    Cube(int length,int width,int height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public int getVolume() {
        return (length * width * height);
    }

    public class Main {
        public static void main(String[] args) {
            Cube c1 = new Cube(1,2,3);
            Cube c2 = c1;
            int vol = c2.getVolume();

        }
    }

    class Employee {
        String name;
        double salary;

        //Constructor
        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    //Get/Set
    public int getLength()
    {return length;}
    public void setLength (int Length)
    {this.length =Length;}

    public int getWidth ()
    {
        return width;
    }
    public void setWidth(int Width)
    {
        this.width =Width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int Height)
    {
        this.height=Height;
    }

}



