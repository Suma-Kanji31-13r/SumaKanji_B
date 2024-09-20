package Array_constructor_matrix;
import java.util.*;
public class Find_sum_of_diagonal_elements_in_2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the square matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid matrix size.");
            return;
        }

        // Create a 2D array (matrix) of the given size
        int[][] matrix = new int[n][n];

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the primary diagonal elements
        int sumPrimary = calculateSumOfPrimaryDiagonal(matrix);

        // Display the result for the primary diagonal
        System.out.println("The sum of the primary diagonal elements is: " + sumPrimary);

    }

    public static int calculateSumOfPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Add the element at the ith row and ith column
        }
        return sum;
    }

}
