package Interface;
import java.util.*;
interface Shape {
    void calculateArea();
    void calculatePerimeter(); }
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius; }
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle Area: %.2f\n", area); }
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Circle Perimeter: %.2f\n", perimeter); } }
class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width; }
    public void calculateArea() {
        double area = length * width;
        System.out.printf("Rectangle Area: %.2f\n", area); }
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.printf("Rectangle Perimeter: %.2f\n", perimeter); } }
public class use_of_hierarchical_inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("Enter length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();
        rectangle.calculatePerimeter(); }
}
