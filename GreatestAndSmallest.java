package TDIT_Array;

public class GreatestAndSmallest {
    public static void main(String[] args) {
        int[]arr={22,3,44,22,11};
        int big=0;
        int small=100;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>big){
                big=arr[i];
            } else if (arr[i]<small) {
                small=arr[i];


            }


        }
        System.out.println("largest number "+ big);
        System.out.println("smallest number "+ small);

    }
}
