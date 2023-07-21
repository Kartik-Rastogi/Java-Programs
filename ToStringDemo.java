import java.util.*;

public class ToStringDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number with Decimals:-  ");
        Double input = sc.nextDouble();
        String converse = Double.toString(input);
        int dot = converse.indexOf('.');
        System.out.println(dot + " digits " + "before decimal point.");
        System.out.println((converse.length() - dot - 1) + " digits after decimal point.");
        sc.close();
    }
}