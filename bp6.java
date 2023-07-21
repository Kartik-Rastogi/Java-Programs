public class bp6 {
    public void city(String com[]) {
        for (int i = 0; i < com.length; i++) {
            System.out.print(com[i] + "  ");
        }
        for (int a = 0; a < com.length; a++) {
            for (int b = a + 1; b < com.length; b++) {
                if (com[a].toLowerCase().compareTo(com[b].toLowerCase()) > 0) {
                    String temp = com[a];
                    com[a] = com[b];
                    com[b] = temp;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < com.length; i++) {
            System.out.println("\n" + com[i]);
        }
    }

    public static void main(String args[]) {
        bp6 obj = new bp6();
        obj.city(args);
    }
}
