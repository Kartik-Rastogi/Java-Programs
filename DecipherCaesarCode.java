import java.util.*;

public class DecipherCaesarCode {

    public static String decrypt(String text, int s) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) -
                        s - 65) % 26 + 65);
                result += ch;
            } else {
                char ch = (char) (((int) text.charAt(i) -
                        s - 97) % 26 + 97);
                result += ch;
            }
        }
        return result.toUpperCase();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text:-");
        String text = sc.nextLine();
        System.out.println("Enter the Shift :-");
        int s = sc.nextInt();
        System.out.println("Decipher Text:-" + decrypt(text, s));
        sc.close();
    }
}