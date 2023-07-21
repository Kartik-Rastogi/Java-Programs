import java.util.Scanner;

public class ap3 {
    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter Integer value: ");
        int inum = sr.nextInt();
        System.out.print("Enter Double value: ");
        double dnum = sr.nextDouble();
        System.out.print("Enter Float value: ");
        float fnum = sr.nextFloat();

        System.out.println("\n");
        System.out.println("Int to Byte:  " + (byte) inum);
        System.out.println("Double to Int:  " + (int) dnum);
        System.out.println("Double to Byte:  " + (byte) dnum);
        System.out.println("Int to Char:  " + (char) inum);
        System.out.println("Float to Short:  " + (short) fnum);
        sr.close();
    }
}
