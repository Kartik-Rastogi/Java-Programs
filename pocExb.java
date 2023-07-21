import java.util.*;

public class pocExb {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number between 1 and 10:- ");
            int a = sc.nextInt();
            System.out.println("\nNumber:- " + a);
            sc.close();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("\nOnly Integer values are allowed");
        } finally {
            System.out.println("Thanks for Visiting\n");
        }
    }
}
