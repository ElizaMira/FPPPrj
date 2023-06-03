import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * @author eliz
 * @since 2023 May 29
 */
public class HelloWorld {
     public static void main(String args[])
    {
        System.out.print("Hello World");
        System.out.println("Happy \uD83D\uDE00, Angry \uD83D\uDE20");
        System.out.println("Good \uD83D\uDC4D, Bad \uD83D\uDC4E");
        System.out.println("Heart \uD83D\uDC9E");
        System.out.println("\u1001");
        System.out.println("Use \"\\t\" to produce a tab");

        Scanner sc=new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.println("You wrote: " + sc.nextLine());
        System.out.print("Type your age: ");
        System.out.println("Your age: "+ sc.nextInt());
        sc.close();


    }
}
