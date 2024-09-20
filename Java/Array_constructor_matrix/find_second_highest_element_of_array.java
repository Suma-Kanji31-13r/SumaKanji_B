package Array_constructor_matrix;
import java.util.*;
public class find_second_highest_element_of_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n <= 1) {
            System.out.println("Array should contain at least two elements.");
            return;
        }

        // Initialize an array to hold the elements
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize highest and second highest
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Loop through the array to find the highest and second highest elements
        for (int value : array) {
            if (value > highest) {
                secondHighest = highest;
                highest = value;
            } else if (value > secondHighest && value != highest) {
                secondHighest = value;
            }
        }

        // Check if a second highest element exists
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second highest element in the array.");
        } else {
            System.out.println("The second highest element in the array is: " + secondHighest);
        }
    }
}
