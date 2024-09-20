import java.util.*;
public class value_of_Eulers_number {
    public static void main(String[] args) {
        int n = 10; // You can adjust the value of n as needed
        double e = 1.0;
        double factorial = 1.0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            e += 1.0 / factorial; }
        System.out.println("Euler's number (e) with " + n + " terms: " + e); }
}
