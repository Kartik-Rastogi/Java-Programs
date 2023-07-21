import java.util.InputMismatchException;
import java.util.Scanner;

public class passFail {
    public static int marks;

    public void marks_check() {
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Marks:- ");
            marks = sc.nextInt();
            passFail pf = new passFail();
            pf.marks_check();
            sc.close();
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        } finally {
            System.out.println("Done, It will execute if marks is greater than or less than");
        }
    }
}