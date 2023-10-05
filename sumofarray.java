package TDIT_Array;

class sumofarray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        int addition = 0;
        for (int i = 0; i < arr.length; i++) {
            addition = addition + arr[i];
        }
        System.out.println("adition of given array is " + addition);
    }

}
