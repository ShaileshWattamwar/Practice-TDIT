package TDIT_Ass_forloop;

public class Sumofevennumber {
    public static void main(String[] args) {
        int s=10,sum=0;

        for (int i = 1; i <=2*s; i++) {

            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
