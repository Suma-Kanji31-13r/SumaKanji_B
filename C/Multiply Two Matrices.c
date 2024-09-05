#include <stdio.h>

int main() {
    int row1, col1, row2, col2;

    // Get the dimensions of the first matrix from the user
    printf("Enter the number of rows for the first matrix: ");
    scanf("%d", &row1);

    printf("Enter the number of columns for the first matrix: ");
    scanf("%d", &col1);

    // Get the dimensions of the second matrix from the user
    printf("Enter the number of rows for the second matrix: ");
    scanf("%d", &row2);

    printf("Enter the number of columns for the second matrix: ");
    scanf("%d", &col2);

    // Check if matrix multiplication is possible
    if (col1 != row2) {
        printf("Matrix multiplication not possible.\n");
        return 1;
    }

    // Declare matrices
    int matrix1[row1][col1], matrix2[row2][col2], result[row1][col2];

    // Input elements of the first matrix
    printf("Enter elements of the first matrix:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
            scanf("%d", &matrix1[i][j]);
        }
    }

    // Input elements of the second matrix
    printf("Enter elements of the second matrix:\n");
    for (int i = 0; i < row2; i++) {
        for (int j = 0; j < col2; j++) {
            scanf("%d", &matrix2[i][j]);
        }
    }

    // Perform matrix multiplication
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            result[i][j] = 0;
            for (int k = 0; k < col1; k++) {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }

    // Display the result matrix
    printf("\nResult Matrix:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }

    return 0;
}
