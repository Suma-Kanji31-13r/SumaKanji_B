package Array_constructor_matrix;
import java.util.*;
public class counts_non_zero_elements_integer_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Validate the input
        if (size <= 0) {
            System.out.println("Please enter a valid size.");
            return;
        }

        // Initialize an array to hold the user input
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Count and print the number of non-zero elements in the array
        int nonZeroCount = countNonZeroElements(array);
        System.out.println("Number of non-zero elements in the array: " + nonZeroCount);
    }

    private static int countNonZeroElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }
}
