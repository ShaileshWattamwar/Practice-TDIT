package TDIT_Ass_forloop;

public class Sum1 {
    public static void main(String[] args) {
        int z=5,fact=1;

        while (z>0){

            fact=fact*z;
            z--;
        }
        System.out.println("sum of numbers are "+ fact);
    }
}
