class extras {

    public void int_adder(String ars[]) {
        int add = 0;
        for (int i = 0; i < ars.length; i++) {
            add = add + Integer.parseInt(ars[i]);
        }
        System.out.print("\tSum Of Given Integer Adder:- " + add);
    }
}

public class ap1b {
    public static void main(String args[]) {
        extras ob = new extras();
        ob.int_adder(args);
    }
}
