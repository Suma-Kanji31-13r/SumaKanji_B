import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Factorial {
    public static void main(String[] args) {
        // Using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial (Scanner): ");
        int number = scanner.nextInt();
        System.out.println("Factorial (Using Scanner): " + factorial(number));

        // Using BufferedReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number to calculate its factorial (BufferedReader): ");
            number = Integer.parseInt(reader.readLine());
            System.out.println("Factorial (Using BufferedReader): " + factorial(number));
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int factor = 2; factor <= num; factor++) {
            result *= factor;
        }
        return result;
    }
}
