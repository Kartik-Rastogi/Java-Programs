import java.util.*;

public class practice {
    public static void main(String[] args) {
        /**
         * int i;
         * // int j;
         * System.out.println("Hello World");
         * String gs = "Peter Piper Picked an Apple";
         * System.out.println(gs + "\nLength: " + gs.length());
         * System.out.println("Iteration Of String:- ");
         * for (i = 0; i < gs.length(); i++) {
         * System.out.print(gs.charAt(i) + " ");
         * System.out.println(i + "\t\t ");
         * }
         */
        /**
         * System.out.println();
         * for (j = 0; j < gs.length(); j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         */
        String s1 = "";
        String s2 = "";
        LinkedList<Integer> a1 = new LinkedList<Integer>();
        a1.add(5);
        a1.add(7);
        a1.add(9);
        LinkedList<Integer> a2 = new LinkedList<Integer>();
        a2.add(2);
        a2.add(4);
        a2.add(3);
        Iterator<Integer> itr1 = a1.iterator();
        Iterator<Integer> itr2 = a2.iterator();
        while (itr1.hasNext() && itr2.hasNext()) {
            s1 += itr1.next();
            s2 += itr2.next();
        }
        int re = Integer.parseInt(s1) + Integer.parseInt(s2);
        String str = Integer.toString(re);
        char[] ex = str.toCharArray();
        System.out.println(Integer.parseInt(s1));
        System.out.println(Integer.parseInt(s2));
        System.out.println(Integer.toString(re));
        for (int i = str.length(); i-- > 0;) {
            System.out.print(ex[i] + " ");
        }
    }
}