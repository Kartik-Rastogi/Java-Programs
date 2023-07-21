public class ap1 {

    public void addition(String ars[]) {
        int p = 0;
        for (int i = 0; i < ars.length; i++) {
            p = p + Integer.parseInt(ars[i]);
        }
        System.out.print("\tSum Of Given Integer Adder:- " + p);
    }

    public static void main(String args[]) {
        ap1 adder = new ap1();
        adder.addition(args);
    }
}