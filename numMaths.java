import java.util.Scanner;

public class numMaths {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Input:- ");
        double num = sc.nextDouble();
        sc.close();
        double numRound = Math.round(num);
        double numCeil = Math.ceil(num);
        double numFloor = Math.floor(num);
        int numInteger = (int) num;
        System.out.print("\nRound Value:- " + numRound);
        System.out.print("\nCeil Value:- " + numCeil);
        System.out.print("\nFloor Value:- " + numFloor);
        System.out.print("\nType Casting to Int:- " + numInteger);
    }
}