import java.util.Scanner;

public class PrintUpAndDown {

    public static void printUp(int n) {
        // base case
        if(n == 0)
            return;
        // recursive call
        printUp(n - 1);
        // recursive steps
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printDown(int n) {
        // base case
        if(n == 0)
            return;
        // recursive steps
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        // recursive call
        printDown(n - 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Recursively print asterisk upward and downward for number of: ");
        int s = Integer.parseInt(scan.next());

        printUp(s);
        System.out.println();
        printDown(s);
    }
}
