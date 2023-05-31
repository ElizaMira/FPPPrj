public class Prog6 {
    public static void main(String args[]) {

        int [] arr = new int [] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Minimum value is: " + min);
    }
}


