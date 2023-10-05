package TDIT_Array;

public class ArrayReverseProgram {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99,100};
        int[] arr2=new int[arr.length];

        for (int i =arr.length-1;i>=0;i--) {
          arr2[arr.length-i-1]=arr[i];
        }
        for (int i = 0; i <arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}


 class Main
{
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        //print array starting from first element
        // System.out.println("Original Array:");
        // for(int i=0;i<intArray.length;i++)
        //System.out.print(intArray[i] + "  ");
        //System.out.println();
        //print array starting from last element

        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");

    }
}