package TDIT_Ass_forloop;

public class Factorialofgiven {
    public static void main(String[] args) {
        int a=10;
        int fact=1;
        for (int i = a; i>0 ; i--) {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}

