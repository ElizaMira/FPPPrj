import java.util.Arrays;

public class Prog5 {
    public static void main(String args[]) {
        int[] a={5,6,-4,3,1};
        int[] b={3,8,9,11};
        int[] res=combine(a,b);
         System.out.println(Arrays.toString(res));
    }

        public  static int[] combine ( int[] a, int[] b)
        {

        int length = a.length + b.length;
        int[] CombineArray = new int[length];
        int i = 0;
        for (int var : a)
        {
            CombineArray[i] = var;
            i++;
        }
        for (int var : b)
        {
            CombineArray[i] = var;
            i++;
        }
        return CombineArray;

    }

}
