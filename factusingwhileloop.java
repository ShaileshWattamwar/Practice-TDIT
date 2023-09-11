package TDIT_Ass_forloop;

public class factusingwhileloop {
    public static void main(String[] args) {
        int q=4, factorial =1;

        while (q>0){
            factorial=factorial*q;
            q--;
        }
        System.out.println(factorial);
    }
}


