package Array_constructor_matrix;
import java.util.*;
public class sum_of_all_odd_numbers_2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid dimensions.");
            return;
        }

        // Create a 2D array of the specified dimensions
        int[][] array = new int[rows][columns];

        // Prompt the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the array (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the sum of all odd numbers in the 2D array
        System.out.println("The sum of all odd numbers in the array is: " + calculateSumOfOdds(array));
    }

    public static int calculateSumOfOdds(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element % 2 != 0) { // Check if the element is odd
                    sum += element; // Add odd elements to the sum
                }
            }
        }
        return sum;
    }
}
