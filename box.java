public class box {
    double length;
    double width;
    double height;

    public void volume_box() {
        System.out.println("Volume Of Box:- " + (length * width * height));
    }

    public static void main(String args[]) {
        box b1 = new box();
        box b2 = new box();

        b1.length = 10;
        b1.width = 13;
        b1.height = 15;
        b1.volume_box();

        b2.length = 12.50;
        b2.width = 15.65;
        b2.height = 10.69;
        b2.volume_box();
    }
}
