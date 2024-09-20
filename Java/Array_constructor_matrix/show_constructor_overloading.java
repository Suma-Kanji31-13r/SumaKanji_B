package Array_constructor_matrix;
import java.util.*;
public class show_constructor_overloading {
    private int value;
    public show_constructor_overloading() {
        value = 0;}
    public show_constructor_overloading(int val) {
        value = val;}
    public show_constructor_overloading(int val1, int val2) {
        value = val1 + val2;}
    public int getValue() {
        return value;}
    public static void main(String[] args) {
        show_constructor_overloading obj1 = new show_constructor_overloading();
        show_constructor_overloading obj2 = new show_constructor_overloading(10);
        show_constructor_overloading obj3 = new show_constructor_overloading(20, 30);
        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
    }
}
