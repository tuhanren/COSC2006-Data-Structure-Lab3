import java.util.Scanner;

public class FibonacciSequence1 {
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
        System.out.print("Please Enter a integer: ");
        int s = Integer.parseInt(scan.next());
        System.out.println("The " + s + " th fibonacci number is: " + fib(s));
    }
}