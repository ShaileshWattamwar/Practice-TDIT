package TDIT_Pratice;

////Write Java program to Find Factorial of a Number
class Findfactorial {
    public static void main(String[] args) {
        int n = 4;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial of given number is " + fact);
    }
}
