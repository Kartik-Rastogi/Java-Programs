import java.util.Scanner;

public class bp5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Coordinates:- ");
        int n = sc.nextInt();
        double[][] p = new double[n][2];

        System.out.println("Enter co-ordinates (x, y):-");
        for (int a = 0; a < n; a++) {
            p[a][0] = sc.nextInt();
            p[a][1] = sc.nextInt();
        }

        double x = p[0][0], y = p[0][1], x1 = p[1][0], y1 = p[1][1];
        double short_dist = dist(x, y, x1, y1);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (short_dist > dist(p[i][0], p[i][1], p[j][0], p[j][1])) {
                    x = p[i][0];
                    y = p[i][1];
                    x1 = p[j][0];
                    y1 = p[j][1];

                    short_dist = dist(x, y, x1, y1);
                }
            }
        }

        System.out.println(" Shortest Distance with points (" + x + ", " + y + ") and (" + x1 + ", " + y1 + "): "
                + (float) short_dist);
        sc.close();

    }

    static double dist(double x, double y, double x1, double y1) {
        return Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
    }
}