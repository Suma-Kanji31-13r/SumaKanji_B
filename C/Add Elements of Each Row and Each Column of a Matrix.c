#include <stdio.h>

int main() {
    int row, col;

    // Get the dimensions of the matrix from the user
    printf("Enter the number of rows: ");
    scanf("%d", &row);

    printf("Enter the number of columns: ");
    scanf("%d", &col);

    // Declare a matrix
    int matrix[row][col];

    // Input elements of the matrix
    printf("Enter elements of the matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Calculate and display the sum of each row
    printf("\nSum of Each Row:\n");
    for (int i = 0; i < row; i++) {
        int rowSum = 0;
        for (int j = 0; j < col; j++) {
            rowSum += matrix[i][j];
        }
        printf("Row %d: %d\n", i + 1, rowSum);
    }

    // Calculate and display the sum of each column
    printf("\nSum of Each Column:\n");
    for (int j = 0; j < col; j++) {
        int colSum = 0;
        for (int i = 0; i < row; i++) {
            colSum += matrix[i][j];
        }
        printf("Column %d: %d\n", j + 1, colSum);
    }

    return 0;
}
