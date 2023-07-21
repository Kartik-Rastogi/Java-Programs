import java.util.*;

public class pocExc {

    public void number() throws InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number between 1 and 10:- ");
            int a = sc.nextInt();
            System.out.println(a);
            sc.close();
        } catch (InputMismatchException ime) {
            System.out.println("\n" + ime + "\n\nOnly Integer values are allowed");
        } finally {
            System.out.println("Thanks for Visiting\n");
        }
    }

    public static void main(String[] args) {
        pocExc ob = new pocExc();
        ob.number();
    }
}
