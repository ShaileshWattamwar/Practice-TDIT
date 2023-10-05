package TDIT_Array;
///1) Create two integer arrays of diff sizes.
// Create third array with size = size array1 + size array2.
// And add all elements of array1 first then add all elements for array2

public class CombinationOfTwoArray {
    public static void main(String[] args) {
        int[]arr1={33,44,55};
        int[]arr2={66,77,88,99};

        int comibantion=arr1.length+arr2.length;

        int[]arr3= new int[comibantion];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[arr1.length+i]=arr2[i];
        }

        System.out.print("combination of array one and two ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+ "  ");
        }
    }

}
