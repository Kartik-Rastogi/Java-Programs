import java.util.Scanner;

public class reverseSt {

    public void reverses(String str) {
        String words[] = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + reversedString);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String inputs = sc.nextLine();
        sc.close();
        reverseSt obj = new reverseSt();
        obj.reverses(inputs);
    }
}