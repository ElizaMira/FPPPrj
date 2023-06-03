public class Assignment4 {
    public static void main(String args[]){

        // Reverse Digit
        int num = 345;
        reverseDigit(num);


        //Digit Count
        int num2 = 23145;
        int count= countDigit(num2);
        System.out.println("Number of digit count is: "+count);

        //Sum of Array
        int[] a = { 3, 4, 5, 1, 1 };
        int sum = sumArray(a, a.length-1);
        System.out.println("The sum of the arrary is: "+sum);
    }

    //1. Reverse Digit
    public static void reverseDigit(int num)

    {

        if (num < 10) {
            System.out.println(num);
            return;
        }

        else {

            System.out.print(num % 10);
            reverseDigit(num / 10);
        }
    }


//2. Digit Count
    public static int countDigit(int num) {
        if (num / 10 == 0) {
            return 1;}
       else {
            return 1 + countDigit(num / 10);
        }
    }

    //3. Sum of array
    public static int sumArray(int[] a,int n)
    {
        if (n == 0)
            return a[n];
        else
            return a[n] + sumArray(a, n-1);

    }
}