import java.util.Scanner;

public class Prog1 {

    public static void main(String args[])
    {
        //Problem – 1
        RandomNumbers rn = new RandomNumbers();
        int x=rn.getRandomInt(1, 9);


        double xResult=Math.pow(Math.PI ,x);
        System.out.println(xResult);
        int y=rn.getRandomInt(3,14);
        double yResult=Math.pow(y,Math.PI );
        System.out.println(yResult);





    }

}

