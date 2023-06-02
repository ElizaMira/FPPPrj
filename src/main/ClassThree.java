package main;

public class ClassThree {
    //The program execution order is as follow:
    // 1.Firstly static field initializaton
    //2. Execute first static initialization block
    //3.Execute second static initialization block
    //4.First instance initialization method
    //5.Second instance initialization method
    //6.Execute first instance  block
    //7.Execute second instance  block
    //8.Run ClassThree constructor with no parameter
    //9.For second ClassThree obj2, static field initialization and methods will not be run again as they are already executed
    //10.First instance initialization method
    //11.Second instance initialization method
    //12.Execute first instance  block
    //13.Execute second instance  block
    //14.Run ClassThree constructor with one parameter

    public static int stcNum=StaticInitializeMethod();
    private int num1=InstanceInitialize1();
    private int num2=InstanceInitialize2();

    ClassThree()
    {
        System.out.println("This is zero parameter constructor");
    }
    ClassThree(String str)
    {
        System.out.println("This is one parameter constructor "+ str);
    }


     static int StaticInitializeMethod()
    {
        System.out.println("This is first static field initialization");
        return GetStaticField();
    }
    static int GetStaticField()
    {
        return 1;

    }
    private int InstanceInitialize1()
    {
        System.out.println("This is first instance initialization");
        return 2;
    }
    private int InstanceInitialize2()
    {
        System.out.println("This is second instance initialization");
        return 3;
    }
    {
        System.out.println("Execute First instance initialization block");
        System.out.println("Instance Num=" +num1);
    }
    {
        System.out.println("Execute Second instance initialization block ");
        System.out.println("Instance Num=" +num2);
    }
    static
    {
        System.out.println("Execute first static  block");
        System.out.println("Static Num=" +stcNum);
    }
    static
    {
        System.out.println("Execute second static block");
        System.out.println("Static Num=" +stcNum);
    }
    public static void main(String args[])
    {
        ClassThree obj1=new ClassThree();
        ClassThree obj2=new ClassThree("Hello");

    }

}
