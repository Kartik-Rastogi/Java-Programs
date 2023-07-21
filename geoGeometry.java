interface GeoAnalyzer {
    double pi = 3.142;

    double area(double x, double y);

    double perimeter(double x, double y);
}

class circle implements GeoAnalyzer {
    public double area(double x, double y) {
        return (pi * Math.pow(x, 2));
    }

    public double perimeter(double x, double y) {
        return (2 * pi * x);
    }
}

class rectangle implements GeoAnalyzer {
    public double area(double x, double y) {
        return (x * y);
    }

    public double perimeter(double x, double y) {

        return (2 * (x + y));
    }
}

class ellipse implements GeoAnalyzer {
    public double area(double x, double y) {
        return (pi * x * y);
    }

    public double perimeter(double x, double y) {
        return (pi * (x + y));
    }
}

public class geoGeometry {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();
        ellipse e = new ellipse();
        GeoAnalyzer a;

        a = r;
        System.out.println("Area of Rectangle is : " + a.area(10, 20));
        System.out.println("Perimeter of Rectangle is : " + a.perimeter(20, 15));
        a = c;
        System.out.println("Area of Circle is : " + a.area(15, 15));
        System.out.println("Perimeter of Circle is : " + a.perimeter(12, 10));
        a = e;
        System.out.println("Area of Ellipse is : " + a.area(15, 25));
        System.out.println("Perimeter of Ellipse is : " + a.perimeter(7, 10));
    }
}
