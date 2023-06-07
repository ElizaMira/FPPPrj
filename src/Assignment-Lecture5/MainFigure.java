package Assignment5;

import java.sql.SQLOutput;

public class MainFigure {
    public static void main(String args[])
    {


        Figure F1=new UpwardHat();
        Figure F2=new UpwardHat();
        Figure F3=new DownwardHat();
        Figure F4=new FaceMaker();
        Figure F5=new Vertical();

        Figure[] figs=new Figure[5];
        figs[0]=F1;
        figs[1]=F2;
        figs[2]=F3;
        figs[3]=F4;
        figs[4]=F5;
        int a=5;
        for(Figure F:figs)
        {

           F.getFigure();

        }


        System.out.print("\n");
        System.out.print("UpwardHat :");
        F1.getFigure();

        System.out.print("\n");
        System.out.print("UpwardHat :");
        F2.getFigure();

        System.out.print("\n");
        System.out.print("DownwardHat:");
        F3.getFigure();

        System.out.print("\n");
        System.out.print("FaceMaker :");
        F4.getFigure();

        System.out.print("\n");
        System.out.print("Vertical :");
        F5.getFigure();


        }
    }

