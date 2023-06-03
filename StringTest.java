public class StringTest {
    public static void main(String args[])
    {
        //substring
        String name="Robert";
        String sub1=name.substring(0,3);
        System.out.print(sub1)
        name.substring(0,name.length());
        name.substring(0,1);
        name.substring(0,0);
        System.out.print()


        //startsWith
        String name="Robert";
        name.startsWith("Rob");
        name.startsWith("R");
        name.startsWith("bert");

        //indexOf
        String name="Robert";
        name.indexOf('t');
        name.indexOf("bert");

        //concatenation +
        String name="Robert";
        String space=" ";
        String lastName="Stevens";
        name+space+lastName;

        //equals
        String name="Robert";
        name.equals("Robert");
        name=="Robert";
        String newName=new String("Robert");
        newName="Robert";
        newName.equals("Robert");

        //
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        String str4=new String("Hello");
        String str5=str4;

        String Res=str1==str2;

        System.out.println(Res);

        int x=15;
        int result=x << 3;
        system.out.println(integer.toBinayString(result));
        system.out.println(integer.toBinayString(x));
        system.out.println(integer.toBinayString(+result));
        int[] smallprime={2,3,5,7,11};

        int[] luckynum={350,400,150,200,250};
        System.arraycopy(smallprime,1,luckynum,3,2)
                System.out.println(luckynum)










    }
}
