package Array_constructor_matrix;
import java.util.*;
public class Sum_of_two_dimensional_arrays {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = array1[i][j] + array2[i][j]; } }
        System.out.println("Sum of two 2D arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " "); }
            System.out.println(); } }
}
