import Relate.Relatable;

class RectanglePlusCp9 implements Relatable {
    public int length = 0;
    public int breadth = 0;

    public RectanglePlusCp9(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }

    public int isLargerThan(Relatable other) {
        RectanglePlusCp9 otherRect = (RectanglePlusCp9) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }
}

public class relateCP {
    public static void main(String[] args) {
        RectanglePlusCp9 r1 = new RectanglePlusCp9(8, 10);
        RectanglePlusCp9 r2 = new RectanglePlusCp9(3, 9);
        RectanglePlusCp9 r3 = new RectanglePlusCp9(6, 9);
        r1.getArea();
        r2.getArea();
        r3.getArea();
        if (r1.isLargerThan(r2) == 1) {
            System.out.println("Rectangle 1 is greater than rectangle 2");
        } else
            System.out.println("Rectangle 1 is not greater than rectangle 2");
        if (r2.isLargerThan(r3) == 1) {
            System.out.println("Rectangle 2 is greater than rectangle 3");
        } else
            System.out.println("Rectangle 2  is not greater than rectangle 3");
    }
}
