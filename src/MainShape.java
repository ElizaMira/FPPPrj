package Inheritance;

public class MainShape {
    public static void main(String args[]) {

        Shape R1 = new Rectangle("White", 10, 2);
        Shape R2 = new Rectangle("Black", 4, 2);
        Shape C1 = new Circle("Red", 5);
        Shape C2 = new Circle("Purple", 5);
        Shape S1 = new Square("Yellow", 6);

        Shape[] shapes = new Shape[5];
        shapes[0] = R1;
        shapes[1] = R2;
        shapes[2] = C1;
        shapes[3] = C2;
        shapes[4] = S1;

        printTotal(shapes);

    }
    public static void printTotal(Shape[] shapes){
        Double TotalArea=0.0;
        Double TotalPerimeter=0.0;
        for(Shape SH:shapes)
        {

            TotalArea+= SH.calculateArea();
            TotalPerimeter +=SH.calculatePerimeter() ;

        }
        System.out.println("Total Area of all the shapes "+ TotalArea);
        System.out.println("Total Perimeter of all the shapes "+ TotalPerimeter);
    }

}
