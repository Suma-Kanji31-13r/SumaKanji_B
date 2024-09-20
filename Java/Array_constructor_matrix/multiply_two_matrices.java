package Array_constructor_matrix;
import java.util.*;
public class multiply_two_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and columns for first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] firstMatrix = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                firstMatrix[i][j] = scanner.nextInt();}}
        System.out.println("Enter rows and columns for second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication cannot be performed due to incompatible dimensions.");
            return;}
        int[][] secondMatrix = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                secondMatrix[i][j] = scanner.nextInt();}}
        int[][] resultMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) { // or k < rows2
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];}}}
        System.out.println("Result of the multiplication:");
        for (int[] row : resultMatrix) {
            for (int element : row) {
                System.out.print(element + " ");}
            System.out.println();}
        scanner.close(); }
}
