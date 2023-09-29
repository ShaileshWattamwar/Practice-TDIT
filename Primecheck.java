package TDIT_Pratice;

class Primecheck {
    public static void main(String[] args) {
        int n = 13;
        boolean number = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                number = true;
                break;
            }
        }

        if (!number)
            System.out.println(n + " is prime number");
        else
            System.out.println(n + " is not prime number");
    }
}
