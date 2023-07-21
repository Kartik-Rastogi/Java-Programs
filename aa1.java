import java.util.Scanner;

public class aa1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        int velocity = 0, time = 10, inpos = 0;
        double acc = -9.81, ans;

        while (option != 0) {
            System.out.println("Gravity Calculator");
            System.out.println("Enter Your Choice");
            System.out.println("1.Enter Initial Velocity");
            System.out.println("2.Enter Initial Position");
            System.out.println("3.Enter Time");
            System.out.println("4.Enter Initial Velocity & Initial Position");
            System.out.println("5.Enter Initial Velocity & Time");
            System.out.println("6.Enter Initial Position & Time");
            System.out.println("7.Enter Initial Velocity, Initial Position & Time");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter Initial Velocity:- ");
                    velocity = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Enter Initial Position:- ");
                    inpos = sc.nextInt();
                    break;

                case 3:
                    System.out.println("Enter Time:- ");
                    time = sc.nextInt();
                    break;

                case 4:
                    System.out.println("Enter Initial Velocity");
                    velocity = sc.nextInt();
                    System.out.println("Enter Initial Position");
                    inpos = sc.nextInt();
                    break;

                case 5:
                    System.out.println("Enter Initial Velocity");
                    velocity = sc.nextInt();
                    System.out.println("Enter Initial Time");
                    time = sc.nextInt();
                    break;

                case 6:
                    System.out.println("Enter Initial Position");
                    inpos = sc.nextInt();
                    System.out.println("Enter Time");
                    time = sc.nextInt();
                    break;

                case 7:
                    System.out.println("Enter Initial Velocity");
                    velocity = sc.nextInt();
                    System.out.println("Enter Initial Position");
                    inpos = sc.nextInt();
                    System.out.println("Enter Time");
                    time = sc.nextInt();
                    break;

                default:
                    System.out.println("Wrong Value!! ");
                    break;
            }
            ans = (0.5 * acc * Math.pow(time, 2)) + velocity * time + inpos;
            System.out.println("Gravity Calculated:-" + ans);
            System.out.println("Do you want to continue ? Enter 1 or 0 ");
            option = sc.nextInt();
        }
        sc.close();
    }
}