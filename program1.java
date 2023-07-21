//Trying through simple steps, variations can be made and added in this file
class program1 {
    public static void main(String args[]) {
        int arr1[][] = { { 7, 5, 6 }, { 3, 2, 4 }, { 8, 9, 1 } };
        int arr2[][] = { { 5, 6, 9 }, { 2, 4, 9 }, { 7, 3, 2 } };
        int s, i, j;
        System.out.println("Trial Addition of Two Arrays");
        System.out.print("First Array:- \n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
                // System.out.print("\t\t" + arr2[i][j]);
            }
            System.out.println();
        }
        /**
         * System.out.println();
         * System.out.print("Second Array:- \n");
         * for (i = 0; i < 3; i++) {
         * for (j = 0; j < 3; j++) {
         * System.out.print(arr2[i][j] + "\t");
         * }
         * System.out.println();
         * }
         * System.out.println();
         */
        System.out.print("Concatenated Array:- \n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                s = arr1[i][j] + arr2[i][j];
                System.out.print(s + "\t");
            }
            System.out.println("\n");
        }
    }
}