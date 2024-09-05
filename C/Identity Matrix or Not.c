#include <stdio.h>

int main() {
    int n;

    // Get the order of the matrix from the user
    printf("Enter the order of the square matrix: ");
    scanf("%d", &n);

    // Declare a matrix
    int matrix[n][n];

    // Input elements of the matrix
    printf("Enter elements of the matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Check whether the matrix is an identity matrix
    int isIdentity = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                isIdentity = 0;
                break;
            }
        }
        if (!isIdentity) {
            break;
        }
    }

    // Display the result
    if (isIdentity) {
        printf("The matrix is an Identity Matrix.\n");
    } else {
        printf("The matrix is not an Identity Matrix.\n");
    }

    return 0;
}
