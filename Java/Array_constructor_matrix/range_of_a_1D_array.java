package Array_constructor_matrix;
import java.util.*;
public class range_of_a_1D_array {
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

        // Find the range of the array
        int range = findRange(array);
        System.out.println("The range of the array is: " + range);
    }

    public static int findRange(int[] array) {
        if (array.length == 0) {
            // Return 0 if the array is empty
            return 0;
        }

        int min = array[0];
        int max = array[0];

        // Iterate over the array to find the minimum and maximum elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // The range is the difference between the maximum and minimum elements
        return max - min;
    }
}
