import java.util.*;

public class bp9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Rows:- ");
        int r = sc.nextInt();

        int[][] a = new int[r][];
        for (int i = 0; i < r; i++) {
            a[i] = new int[i + 1];
            for (int k = 0; k < r; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = j + 1;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int[][] b = new int[r][];
        for (int i = 0; i < r; i++) {
            b[i] = new int[i + 1];
            for (int k = r - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = j + 1;
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}