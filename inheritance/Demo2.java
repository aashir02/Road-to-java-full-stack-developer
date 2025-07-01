class Circle {
    int radius;

    public static void areaCircle(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
    }
}

class Cylinder extends Circle {
    public static void areaCylinder(int radius, int height) {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of cylinder is " + area);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Circle.areaCircle(2);
        Cylinder.areaCylinder(2, 5);
    }
}
