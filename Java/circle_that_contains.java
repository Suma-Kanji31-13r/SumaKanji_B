import java.util.*;
public class circle_that_contains {
    // Private instance variables
    private double radius2;
    private String color2;

    // Default constructor
    public circle_that_contains() {
        this.radius2 = 1.0;
        this.color2 = "red";
    }

    // Constructor with given radius but default color
    public circle_that_contains(double radius2) {
        this.radius2 = radius2;
        this.color2 = "red";
    }

    // Method to return the radius
    public double getRadius() {
        return this.radius2;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius2 * radius2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using the default constructor
        circle_that_contains defaultCircle = new circle_that_contains();
        System.out.println("Circle with default radius and color:");
        System.out.println("Radius: " + defaultCircle.getRadius() + ", Area: " + defaultCircle.getArea());

        // Using the constructor with user-specified radius
        System.out.println("\nEnter radius for a new circle:");
        double userRadius = scanner.nextDouble();
        circle_that_contains userCircle = new circle_that_contains(userRadius);
        System.out.println("Circle with user-specified radius and default color:");
        System.out.println("Radius: " + userCircle.getRadius() + ", Area: " + userCircle.getArea());
    }
}
