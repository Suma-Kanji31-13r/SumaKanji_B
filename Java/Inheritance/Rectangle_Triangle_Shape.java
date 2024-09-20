package Inheritance;
import java.util.*;
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width; }
    public double calculateArea() {
        return length * width; }
    public double calculatePerimeter() {
        return 2 * (length + width); } }
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3; }
    public double calculateArea() {
        return (base * height) / 2; }
    public double calculatePerimeter() {
        return side1 + side2 + side3; } }
public class Rectangle_Triangle_Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("\nEnter the base and height of the triangle followed by the lengths of all three sides:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height, side1, side2, side3);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        scanner.close(); }
}
