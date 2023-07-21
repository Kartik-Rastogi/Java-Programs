import java.util.Scanner;

class binarySearch {
   public static int BinarySearch(int a[], int start, int end, int x) {
      if (start <= end) {
         int middle = (start + end) / 2;
         if (a[middle] == x) {
            return middle;
         }

         if (a[middle] > x) {
            return BinarySearch(a, start, middle - 1, x);
         }

         if (a[middle] < x) {
            return BinarySearch(a, middle + 1, end, x);
         }
      }
      return -1;
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

      
      System.out.print("\nElement to be searched is:");
      int val = sc.nextInt();

      int result = BinarySearch(array, 0, array.length-1, val);

      if (result==-1) {
         System.out.print("Element is not present");
      } else {
         System.out.print("Element present at:"+result);
      }
      sc.close();
   }
}
