package Inheritance;
import java.util.*;
public class method_overloading {
    void display() {
        System.out.println("Method with no parameters"); }
    void display(int num) {
        System.out.println("Method with one parameter: " + num); }
    void display(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + " and " + num2); }
    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.display();
        obj.display(5);
        obj.display(10, 20); }
}
