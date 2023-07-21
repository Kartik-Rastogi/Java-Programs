import java.util.Scanner;

public class VowelFilter {

    static char[] wordFilter(char arr[]) {
        String temp = "";
        char consonants[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j',
                'k', 'l', 'm', 'n', 'p', 'q', 'r',
                's', 't', 'v', 'w', 'x', 'y', 'z' };

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < consonants.length; b++) {
                if (arr[a] == consonants[b]) {
                    temp += arr[a] + " ";
                }
            }
        }
        return temp.toCharArray();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        for (char ch : wordFilter(sc.nextLine().toLowerCase().toCharArray())) {
            System.out.print(ch);
        }
        sc.close();
    }
}
