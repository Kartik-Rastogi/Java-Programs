public class bp1 {
    public static void main(String args[]) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412 };
        int first = times[0];
        int second = times[0];
        String fname = names[0];
        String sname = names[0];

        for (int i = 0; i < times.length; i++) {
            if (times[i] < first) {
                second = first;
                sname = fname;
                first = times[i];
                fname = names[i];
            }

            else if (times[i] < second) {
                second = times[i];
                sname = names[i];
            }
        }
        System.out.println("Fastest Runner: " + fname + " With Time: " + first);
        System.out.println("Second Fastest Runner: " + sname + " With Time: " + second);
    }
}
