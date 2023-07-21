import java.util.Scanner;

public class ap5 {
    public static void main(String args[]) {
        Scanner si = new Scanner(System.in);
        int[] inputs = new int[3];
        System.out.println("Enter Three Inputs:- ");
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] >= 0 && inputs[i] <= 9)
                inputs[i] = si.nextInt();
        }
        System.out.println("All Possible Combinations: ");
        for (int a = 0; a < inputs.length; a++) {
            for (int b = 0; b < inputs.length; b++) {
                for (int c = 0; c < inputs.length; c++) {
                    if (a != b && b != c && c != a)
                        System.out.println(inputs[a] + "" + inputs[b] + "" + inputs[c]);
                }
            }
        }
        si.close();
    }
}