package Assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Score {


    public static void main(String[] args) {
        int score = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");

        try {
            score = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("input should be only integer value ");

        }

        try
        {
            if(score<0 || score>100) throw new UnsupportedOperationException("Inputs is not in the range of 0-100");


        }catch (UnsupportedOperationException i)
        {
            System.out.println(i.getMessage());
        }

    }
}
