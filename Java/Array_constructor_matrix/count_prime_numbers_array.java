package Array_constructor_matrix;
import java.util.*;
public class count_prime_numbers_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Prompt the user to input the numbers
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count and print the number of prime numbers in the array
        int primeCount = countPrimes(numbers);
        System.out.println("There are " + primeCount + " prime numbers in the array.");
    }

    private static boolean isPrime(int number) {
        // Check if number is less than 2, 0 and 1 are not prime
        if (number < 2) {
            return false;
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    private static int countPrimes(int[] numbers) {
        int primeCount = 0;

        // Check each number in the array for primality
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
