import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequence2 {
    public static int fib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        } else {
            // recursive call
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer n to print the first n Fibonacci numbers: ");
        int s = Integer.parseInt(scan.next());

        int[] fibArr = new int[s];
        for(int i = 0; i < fibArr.length; i++){
            fibArr[i] = fib(i + 1);
        }
        System.out.println(Arrays.toString(fibArr));
    }
}