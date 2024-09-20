import java.util.*;
public class area_and_perimeter_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
    }
}
