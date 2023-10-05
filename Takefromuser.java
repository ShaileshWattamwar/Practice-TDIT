package TDIT_Array;
import java.util.Scanner;
public class Takefromuser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("give size of array");
        int n= sc.nextInt();
        int[] arr =new int[n];

        System.out.println("give elements");
        for (int i = 0; i <arr.length ; i++) {
        arr[i]= sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
                                                
    }
}
