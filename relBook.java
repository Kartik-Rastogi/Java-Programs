interface Relatable {
    public int isLargerthan(Relatable r);
}

class Book implements Relatable {
    private String bName;
    private int noOfPages;

    Book(String bn, int nop) {
        bName = bn;
        noOfPages = nop;
    }

    public String getBName() {
        return bName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public int isLargerthan(Relatable r) {
        Book b = (Book) r;
        if (this.getNoOfPages() > b.getNoOfPages())
            return 1;
        else if (this.getNoOfPages() < b.getNoOfPages())
            return -1;
        else
            return 0;
    }
}

public class relBook {
    public static void main(String[] args) {
        Book b1 = new Book("abc", 400);
        Book b2 = new Book("pqr", 900);
        Book b3 = new Book("xyz", 600);
        Book b4 = new Book("egf", 300);
        System.out.println("b1 name: " + b1.getBName() + ", no of pages: " + b1.getNoOfPages());
        System.out.println("b2 name: " + b2.getBName() + ", no of pages: " + b2.getNoOfPages());
        System.out.println("b3 name: " + b3.getBName() + ", no of pages: " + b3.getNoOfPages());
        System.out.println("b4 name: " + b4.getBName() + ", no of pages: " + b4.getNoOfPages());
        System.out.println("Comparison of b1 and b2: " + b1.isLargerthan(b2));
        System.out.println("Comparison of b1 and b3: " + b1.isLargerthan(b3));
        System.out.println("Comparison of b2 and b4: " + b2.isLargerthan(b4));
    }
}