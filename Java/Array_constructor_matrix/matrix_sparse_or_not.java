package Array_constructor_matrix;
import java.util.*;
public class matrix_sparse_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the matrix with the specified dimensions
        int[][] matrix = new int[rows][columns];

        // Prompt the user to input the elements of the matrix
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is sparse and print the result
        if (isSparse(matrix)) {
            System.out.println("The given matrix is sparse.");
        } else {
            System.out.println("The given matrix is not sparse.");
        }
    }

    public static boolean isSparse(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;

        // Count the number of zero elements in the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    zeroCount++;
                }
            }
        }

        // Check if the number of zeros is greater than half of the total elements
        return zeroCount > (totalElements / 2);
    }
}
