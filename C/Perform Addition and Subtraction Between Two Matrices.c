#include <stdio.h>

int main() {
    int row, col;

    // Get the dimensions of the matrices from the user
    printf("Enter the number of rows: ");
    scanf("%d", &row);

    printf("Enter the number of columns: ");
    scanf("%d", &col);

    // Declare two matrices
    int matrix1[row][col], matrix2[row][col], sumMatrix[row][col], diffMatrix[row][col];

    // Input elements of the first matrix
    printf("Enter elements of the first matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &matrix1[i][j]);
        }
    }

    // Input elements of the second matrix
    printf("Enter elements of the second matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &matrix2[i][j]);
        }
    }

    // Perform addition and subtraction
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            // Addition
            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            // Subtraction
            diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
        }
    }

    // Display the sum matrix
    printf("\nSum Matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("%d ", sumMatrix[i][j]);
        }
        printf("\n");
    }

    // Display the difference matrix
    printf("\nDifference Matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("%d ", diffMatrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}
