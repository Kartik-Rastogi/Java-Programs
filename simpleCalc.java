import java.util.*;

public class simpleCalc {
    public static void main(String[] args) {
        int option = 0, ex = 0, num1 = 0, num2 = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Simple Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            try {
                System.out.println("\nEnter the option:- ");
                option = sc.nextInt();
                if (option != 5) {
                    System.out.println("Enter the first number");
                    num1 = sc.nextInt();
                    System.out.println("Enter the second number");
                    num2 = sc.nextInt();
                } else {
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Exception:- Don't enter character or string");
            }

            switch (option) {
                case 1:
                    try {
                        if (num1 == 0 && num2 == 0) {
                            throw new Exception("Enter value greater than zero");
                        }
                        System.out.println("Addition of " + num1 + " + " + num2 + " is " + (num1 + num2));
                    } catch (InputMismatchException ime) {
                        System.out.print("\nPlease Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    try {
                        if (num1 == 0 && num2 == 0) {
                            throw new Exception("Enter value greater than zero");
                        }
                        System.out.println("Subtraction of " + num1 + " - " + num2 + " is " + (num1 - num2));
                    } catch (InputMismatchException ime) {
                        System.out.println("\nPlease Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        if (num1 == 0 && num2 == 0) {
                            throw new Exception("Enter value greater than zero");
                        }
                        System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + (num1 * num2));
                    } catch (InputMismatchException ime) {
                        System.out.println("\nPlease Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        if (num1 == 0 && num2 == 0) {
                            throw new Exception("Enter value greater than zero");
                        }

                        if (num2 == 0) {
                            System.out.println("Error!!!, In Division denominator cannot be 0!");
                        }

                        else {
                            System.out
                                    .println("In division of " + num1 + " by " + num2 + " quotient is " + (num1 / num2)
                                            + " and remainder is " + (num1 % num2));
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("\nPlease Enter a number not character or string");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            try {
                System.out.println("Do you want to continue?1 or 0");
                ex = sc.nextInt();
            } catch (InputMismatchException nfe) {
                System.out.println("Exception:- Don't enter character or string");
            }
        } while (ex == 1);
    }
}