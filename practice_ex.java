class practice_ex {
    public static void main(String args[]) {
        int test[] = { 1, 2, 1, 6, 6, 4, 8, 7, 9, 8 };
        int p = 0;
        for (int i = 0; i < test.length; i++) {
            for (int j = i + 1; j < test.length; j++) {
                if (test[i] == test[j]) {
                    p++;
                    System.out.println(test[i] + "" + test[j]);
                }
            }
        }
        System.out.print("Pairs of Similar Digits:- " + p);
    }
}