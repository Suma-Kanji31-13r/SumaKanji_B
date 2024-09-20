package Array_constructor_matrix;
import java.util.*;
public class parameterized_constructor {
    private int value;
    public parameterized_constructor(int val) {
        value = val;
        System.out.println("Parameterized constructor called with value: " + val);
    }
    public static void main(String[] args) {
        parameterized_constructor obj = new parameterized_constructor(10);}
}
