import java.util.Scanner;
public class Main3 {
    public static void main(String args[]) {

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("R")) {
            System.out.println("Enter the width of the Rectangle");
            double width = sc.nextDouble();
            System.out.println("Enter the length of the Rectangle");
            double length = sc.nextDouble();
            Rectangle r = new Rectangle(width, length);
            double res = r.computeArea();
            System.out.println("The area of Rectangle is : " + res);
        } else if (s.equals("C")) {
            System.out.println("Enter the radius of the circle");
            double radius = sc.nextDouble();
            Circle c=new Circle(radius);
            System.out.println("The area of circle is : " + c.computeArea());
        }
        else if (s.equals("T")) {
            System.out.println("Enter the base of the triangle");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the triangle");
            double height = sc.nextDouble();
            Triangle t=new Triangle(base,height);
            System.out.println("The area of triangle is : " + t.computeArea());
        }
        }
    }

