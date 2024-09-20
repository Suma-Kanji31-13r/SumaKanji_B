package Array_constructor_matrix;
import java.util.*;
public class elements_of_two_integer_arrays_get_added_index_wise_and_get_stored_into_third_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Initialize the arrays
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        int[] sumArray = new int[size];

        // Input for the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            firstArray[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            secondArray[i] = scanner.nextInt();
        }

        // Adding elements index-wise
        for (int i = 0; i < size; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }

        // Displaying the sum array
        System.out.println("Sum of the arrays index-wise:");
        for (int sum : sumArray) {
            System.out.print(sum + " ");
        }
    }
}
