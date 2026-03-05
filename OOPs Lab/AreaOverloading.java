class Area {

    // Area of Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }
}

public class AreaOverloading {
    public static void main(String[] args) {

        Area obj = new Area();

        System.out.println("Area of Circle: " + obj.calculateArea(5));
        System.out.println("Area of Rectangle: " + obj.calculateArea(4, 6));
        System.out.println("Area of Triangle: " + obj.calculateArea(3f, 4f));
    }
}