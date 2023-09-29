package TDIT_Pratice;

class Intarray {
   public static void main(String[] args) {
       int lostnumber=55;
       int[]a=new int[100];
       for (int i = 0; i <100 ; i++) {
           a[i]=i+1;
           if(a[i]==lostnumber){
               System.out.println("lost number is at index value of "+i);
           }
       }
   }
}
