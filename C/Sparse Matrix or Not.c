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

    // Count the number of zeros and non-zeros in the matrix
    int zeroCount = 0;
    int nonZeroCount = 0;

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (matrix[i][j] == 0) {
                zeroCount++;
            } else {
                nonZeroCount++;
            }
        }
    }

    // Determine whether the matrix is sparse or not
    if (zeroCount > nonZeroCount) {
        printf("The matrix is a Sparse Matrix.\n");
    } else {
        printf("The matrix is not a Sparse Matrix.\n");
    }

    return 0;
}
