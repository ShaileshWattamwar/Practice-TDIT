package TDIT_Pratice;
import java.util.Random;

class Generaterandom {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 0;
        int max = 100;
        int b = r.nextInt(100);
        System.out.println(b);
    }
}
