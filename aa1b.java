import java.util.Scanner;

public class aa1b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int velocity = 0, time = 10, inpos = 0;
        double acc = -9.81, ans;
        int op, menu = 1;
        ;
        System.out.println("--Gravity Calculator--");
        System.out.println("Enter Choice to input data:");
        System.out.println("1.Input Initial velocity");
        System.out.println("2.Input Initial Position");
        System.out.println("3.Input Time");
        System.out.println("4.Input Initial velocity & Initial Position");
        System.out.println("5.Input Initial velocity & Time");
        System.out.println("6.Input Initial Position & TIme");
        System.out.println("7.Input Initial velocity & Initial position & Time");
        System.out.print("\nEnter Input:- ");
        op = sc.nextInt();

        while (menu != 0) {
            if (op == 1) {
                System.out.println("Input Initial velocity:");
                velocity = sc.nextInt();
            } else if (op == 2) {
                System.out.println("Input Initial position:");
                inpos = sc.nextInt();
            } else if (op == 3) {
                System.out.println("Input Time:");
                time = sc.nextInt();
            } else if (op == 4) {
                System.out.println("Input Initial velocity:");
                velocity = sc.nextInt();
                System.out.println("Input Initial position:");
                inpos = sc.nextInt();
            } else if (op == 5) {
                System.out.println("Input Initial velocity:");
                velocity = sc.nextInt();
                System.out.println("Input Time:");
                time = sc.nextInt();
            } else if (op == 6) {
                System.out.println("Input Initial position:");
                inpos = sc.nextInt();
                System.out.println("Input Time:");
                time = sc.nextInt();
            } else if (op == 7) {
                System.out.println("Input Initial velocity:");
                velocity = sc.nextInt();
                System.out.println("Input Initial position:");
                inpos = sc.nextInt();
                System.out.println("Input Time:");
                time = sc.nextInt();
            } else {
                System.out.println("Wrong Value");
            }
            ans = (0.5 * acc * Math.pow(time, 2)) + (velocity * time) + inpos;
            System.out.println("Gravity Calculated:-" + ans);

            System.out.println("Do you want to continue ? Enter 1 or 0 ");
            menu = sc.nextInt();
        }
        sc.close();
    }
}
