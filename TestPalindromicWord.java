import java.util.*;

public class TestPalindromicWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String word = sc.nextLine();
        String rword = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rword = ch + rword;
        }
        System.out.println("Reverse Word:- " + rword);
        if (rword.equals(word)) {
            System.out.println("Word is Pallindrome");
        } else {
            System.out.println("Word is not Pallindrome");
        }
        sc.close();
    }
}