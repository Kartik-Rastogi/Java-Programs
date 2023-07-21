import java.util.Scanner;

class bubbleSort {
   public static void bubble(int a[]) {
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a.length - i - 1; j++) {
            if (a[j] > a[j + 1]) {
               int temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }
      }
   }

   public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      n = sc.nextInt();

      int[] array = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < n; i++) {
         array[i] = sc.nextInt();
      }
      bubble(array);

      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }
      System.out.println("");
      sc.close();
   }
}