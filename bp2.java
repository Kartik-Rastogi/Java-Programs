import java.util.Scanner;

public class bp2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 15 Elements:- ");
        int[] arr = new int[15];
        int[] count = new int[arr.length];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = sc.nextInt();
        }
        sc.close();
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    count[j] = visited;
                }
            }
            if (count[i] != visited)
                count[i] = temp;
        }

        System.out.println("Element And their Frequency");
        for (int i = 0; i < count.length; i++) {
            if (count[i] != visited)
                System.out.println(" " + arr[i] + " --> " + count[i]);
        }
    }
}
