package TDIT_Array;

public class FindNumberInArray {
    public static void main(String[] args) {
        int[]arr={11,6,3,33,88,43};
        int x=43;
        int ans=-1;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==x){
               ans=i;
            }
        }
        System.out.println("found x value "+ x + " at index value of "+ans);

    }
}
