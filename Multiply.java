package TDIT_Array;

public class Multiply {
    public static void main(String[] args) {
        int[] arr={22,33,11,10,6};
       int multi = 1;

        for (int i = 0; i < arr.length; i++) {
            multi=multi*arr[i];
        }
        System.out.println(multi);
    }

}
