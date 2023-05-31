public class Prog2 {
    public static void main(String args[])
        {
        //Problem – 2
        String [][] Product = new String[][]{
                {"231A,Light Bulb,123,Wilco,1.75:"},
                {"113D,Hairbrush,19,Aamco,3.75"},
                {"521W,Shampoo,24,Acme,6.95:"},
                {"440Q,Dishwashing Detergent,20,Wilco,1.75:"}
        };

        for(String[] strArr : Product){
            for(String str : strArr){
                System.out.println(str.substring(0,4));}
        }

    }
}
