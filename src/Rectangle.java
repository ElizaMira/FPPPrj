package Inheritance;

public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(String color,double weight,double height) {
        super(color);
        this.width=weight;
        this.height=height;

    }
    @Override
    public double calculateArea()
        {
            return(width*height);
    }
    @Override
    public double calculatePerimeter()
    {
        return(2*width+2*height);
    }

}
