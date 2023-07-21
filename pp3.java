public class pp3 {

    public static int[] smallerNumbersThanCurrent(int[] numb) {
        int[] result = new int[numb.length];

        for (int x = 0; x < numb.length; x++) {
            for (int y = x + 1; y < numb.length; y++) {
                if (numb[y] < numb[x]) {
                    result[x]++;
                } else if (numb[y] > numb[x]) {
                    result[y]++;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] exams = { 6, 5, 4, 8 };
        int[] ans = smallerNumbersThanCurrent(exams);
        System.out.println("Elements Frequency Array:- ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}