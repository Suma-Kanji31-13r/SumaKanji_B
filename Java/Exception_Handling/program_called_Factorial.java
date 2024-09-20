package Exception_Handling;
import java.util.*;
public class program_called_Factorial {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer (less than or equal to 20): ");
            int x = scanner.nextInt();
            if (x < 0) {
                throw new IllegalArgumentException("Value of x must be positive"); }
            if (x > 20) {
                throw new IllegalArgumentException("Result will overflow"); }
            long[] factorialArray = new long[x + 1];
            factorialArray[0] = 1;
            for (int i = 1; i <= x; i++) {
                factorialArray[i] = factorialArray[i - 1] * i; }
            System.out.println("Factorial of " + x + " is: " + factorialArray[x]);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); } }
}
