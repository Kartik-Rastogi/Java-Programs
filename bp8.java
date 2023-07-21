import java.util.Scanner;

public class bp8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String:- ");
        String sb = sc.nextLine().toLowerCase();
        System.out.println("Enter the Second String:- ");
        String sb1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the String for Splitting:- ");
        String sb2 = sc.nextLine().toLowerCase();
        System.out.println("charAt:- " + sb.charAt(2));
        System.out.println("Length:- " + sb.length());
        System.out.println("Contains:- " + sb.contains("kar"));
        System.out.println("Equals:- " + sb.equals(sb1));
        System.out.println("==:- " + (sb == sb1));
        System.out.println("Index:- " + sb.indexOf('a'));
        System.out.println("String Uppercase:- " + sb.toUpperCase());
        System.out.println("String Splitting:- ");
        String[] arrOfStr = sb2.split("\\s");
        for (String a : arrOfStr)
            System.out.println(a);
        sc.close();
    }
}
