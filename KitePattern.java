package Pattern;

public class KitePattern {
    static void Pattern(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalrowsincol =row>n ? 2 * n-row: row;

            int noofspaces =n-totalrowsincol;
            for (int s = 0; s <noofspaces ; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <totalrowsincol ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Pattern(6);
    }
}
