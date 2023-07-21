import java.util.*;

public class gravitywithtry {
    public static void main(String[] args) {
        int option = 0, op = 1;
        int velocity = 0, time = 0, inpos = 0;
        double acc = -9.81, ans;

        Scanner sc = new Scanner(System.in);
        while (op != 0) {
            System.out.println("Gravity Calculator");
            System.out.println("1.Enter Initial Velocity");
            System.out.println("2.Enter Initial Position");
            System.out.println("3.Enter Time");
            System.out.println("4.Enter Initial Velocity & Initial Position");
            System.out.println("5.Enter Initial Velocity & Time");
            System.out.println("6.Enter Initial Position & Time");
            System.out.println("7.Enter Initial Velocity, Initial Position & Time");

            try {
                System.out.println("\nEnter Your Choice");
                option = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Exception:- Don't enter character or string");
                return;
            }

            switch (option) {
                case 1:
                    System.out.println("Enter Initial Velocity:- ");
                    try {
                        velocity = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");
                    }
                    break;

                case 2:
                    System.out.println("Enter Initial Position:- ");
                    try {
                        inpos = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");
                    }
                    break;

                case 3:
                    System.out.println("Enter Time:- ");
                    try {
                        time = sc.nextInt();
                        if (time == 0) {
                            throw new Exception("Please enter greater than zero");
                        }
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Enter Initial Velocity");
                        velocity = sc.nextInt();
                        System.out.println("Enter Initial Position");
                        inpos = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");
                    }
                    break;

                case 5:

                    try {
                        System.out.println("Enter Initial Velocity");
                        velocity = sc.nextInt();
                        System.out.println("Enter Initial Time");
                        time = sc.nextInt();
                        if (time == 0) {
                            throw new Exception("Please enter greater than zero");
                        }
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:

                    try {
                        System.out.println("Enter Initial Position");
                        inpos = sc.nextInt();
                        System.out.println("Enter Time");
                        time = sc.nextInt();
                        if (time == 0) {
                            throw new Exception("Please enter greater than zero");
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("Please Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:

                    try {
                        System.out.println("Enter Initial Velocity");
                        velocity = sc.nextInt();
                        System.out.println("Enter Initial Position");
                        inpos = sc.nextInt();
                        System.out.println("Enter Time");
                        time = sc.nextInt();
                        if (time == 0) {
                            throw new Exception("Please enter greater than zero");
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("Please Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
            ans = (0.5 * acc * Math.pow(time, 2)) + velocity * time + inpos;
            System.out.println("\nGravity Calculated:-" + ans);

            try {
                System.out.println("\nDo you want to continue ? Enter 1 or 0 ");
                op = sc.nextInt();
            } catch (InputMismatchException nfe) {
                System.out.println("Exception:- Don't enter character or string");
            }
            return;
        }
        sc.close();
    }
}