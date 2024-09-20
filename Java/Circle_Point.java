import java.util.*;
public class Circle_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x coordinate of the circle's center:");
        double x = scanner.nextDouble();

        System.out.println("Enter the y coordinate of the circle's center:");
        double y = scanner.nextDouble();

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        Point center = new Point(x, y);
        Circle circle = new Circle(center, radius);

        circle.displayArea();
    }
}
class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.printf("The area of the circle is: %.2f\n", area());
    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

