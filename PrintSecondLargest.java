package TDIT_Array;

public class PrintSecondLargest {
    public static void main(String[] args) {
        int[]arr={10,22,33,55,33};
        int firstalarge=0;
        int secondlarge=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>firstalarge){
                firstalarge=arr[i];
            }
        }
        System.out.println(firstalarge);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>secondlarge){

                secondlarge=arr[i];
            }
        }




    }
}
