package TDIT_Pratice;
import java.util.Scanner;
class PrintFibonacci {
    public static void main(String[] args) {
        int n, x = 0, y = 0, z = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series is ");
        for (int i = 1; i <= n; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + " ");
        }
    }
}
