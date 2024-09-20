package Array_constructor_matrix;
import java.util.*;
public class n_elements_array_and_find_smallest_number_among_them {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
            return;
        }

        // Create an array to hold the user's numbers
        int[] array = new int[n];

        // Read the n elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize the smallest number to the first array element
        int smallest = array[0];

        // Iterate through the array to find the smallest number
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the smallest number
        System.out.println("The smallest number in the array is: " + smallest);
    }
}
