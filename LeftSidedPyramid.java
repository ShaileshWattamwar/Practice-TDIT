package Pattern;

public class LeftSidedPyramid {
    static void Pattern(int n){
        for (int row = 0;row <2*n ; row++) {
            int totalrowsincol=row>n ? 2 * n-row: row;
            for (int col = 0; col < totalrowsincol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Pattern(6);
    }
}
