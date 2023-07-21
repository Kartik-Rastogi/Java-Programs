import java.util.*;

public class stringsBuilder {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time for String:- " + startTime);
        String rword = "";
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String(String):- ");
        String s = sc.nextLine();
        System.out.println("Enter the String(StringBuilder):- ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println("\nReverse Word for StringB:- " + sb.reverse());

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rword = ch + rword;
        }
        System.out.println("Reverse Word for String:- " + rword);
        if (rword.equals(s)) {
            System.out.println("Word is Pallindrome");
        } else {
            System.out.println("Word is not Pallindrome");
        }
        System.out.println("Time taken by String:- " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("Start Time for StringBuilder:- " + startTime);
        if (sb.equals(sb.reverse())) {
            System.out.println("StringB is palindrome");
        } else {
            System.out.println("StringB is not palindrome");
        }
        System.out.println("Time taken by StringBuilder:- " + (System.currentTimeMillis() - startTime));
        sc.close();
    }
}
