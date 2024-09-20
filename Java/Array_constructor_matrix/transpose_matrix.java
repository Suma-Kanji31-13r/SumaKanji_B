package Array_constructor_matrix;
import java.util.*;
public class transpose_matrix {
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
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose the matrix
        System.out.println("Transpose of the Matrix:");
        printTranspose(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printTranspose(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) { // Loop through columns
            for (int j = 0; j < matrix.length; j++) { // Loop through rows
                System.out.print(matrix[j][i] + " "); // Print the element at the transposed position
            }
            System.out.println();
        }
    }
}
