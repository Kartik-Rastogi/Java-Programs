import java.util.*;

public class studentregister {
    public static void main(String[] args) {
        int age, marks;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Your Age:- ");
            age = sc.nextInt();
            System.out.println("Enter Your Marks:- ");
            marks = sc.nextInt();
            sc.close();
            if (age < 12 || marks < 200) {
                throw new NumberFormatException("Invalid Age Or Marks, Not Eligible");
            }

            else {
                System.out.println("You are Eligible for Registration");
            }
        } catch (InputMismatchException nme) {
            System.out.println("Exception:- Input should be number");
        } catch (NumberFormatException nae) {
            nae.printStackTrace();
        }
    }
}