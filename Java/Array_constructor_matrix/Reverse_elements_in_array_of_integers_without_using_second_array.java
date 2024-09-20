package Array_constructor_matrix;
import java.util.*;
public class Reverse_elements_in_array_of_integers_without_using_second_array {
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

        // Reverse the array in place
        reverseArray(array);

        // Display the reversed array
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line
    }

    public static void reverseArray(int[] array) {
        int start = 0; // Starting index
        int end = array.length - 1; // Ending index

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle of the array
            start++;
            end--;
        }
    }
}
