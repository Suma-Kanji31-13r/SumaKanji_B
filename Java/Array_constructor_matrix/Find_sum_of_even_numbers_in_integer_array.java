package Array_constructor_matrix;
import java.util.*;
public class Find_sum_of_even_numbers_in_integer_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size.");
            return;
        }

        // Create an array of the given size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of even numbers
        int sum = calculateSumOfEvens(array);

        // Display the result
        System.out.println("The sum of even numbers in the array is: " + sum);
    }

    public static int calculateSumOfEvens(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add the even number to the sum
            }
        }
        return sum;
    }
}
