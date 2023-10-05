package TDIT_Array;

public class AdditionOfTwoArrays {
    public static void main(String[] args) {
        int[]arr1={11,22,33};
        int[]arr2={10,20,30};

        int addition=arr1.length;
        int[] arr3=new int[addition];


        for (int i = 0; i <addition; i++) {
            arr3[i]=arr1[i]+arr2[i];
        }
        System.out.print("Sum Array: ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }


    }
}
