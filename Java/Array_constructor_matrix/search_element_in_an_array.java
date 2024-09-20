package Array_constructor_matrix;
import java.util.*;
public class search_element_in_an_array {
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

        // Ask the user for the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform the search
        int index = searchElement(array, target);

        // Output the result
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    public static int searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return the index
            }
        }
        return -1; // Element not found, return -1
    }
}
