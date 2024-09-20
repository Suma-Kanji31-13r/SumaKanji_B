package String;
import java.util.*;
public class Display_Characters_in_Prime_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Display characters at prime positions
        System.out.println("Characters at prime positions: ");
        for (int i = 1; i <= inputString.length(); i++) {
            if (isPrime(i)) {
                // Adjusting position for zero-based indexing
                System.out.println("Position " + i + ": " + inputString.charAt(i - 1));
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by another number, so not prime
            }
        }
        return true; // Number is prime
    }
}
