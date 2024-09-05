#include <stdio.h>

// Function declarations
void inputMatrix(int *matrix, int rows, int cols);
void addMatrices(int *mat1, int *mat2, int *result, int rows, int cols);
void printMatrix(int *matrix, int rows, int cols);

int main() {
    const int rows = 2;
    const int cols = 2;

    int matrix1[rows][cols];
    int matrix2[rows][cols];
    int resultMatrix[rows][cols];

    // Input matrices from the user
    printf("Enter elements for the first matrix:\n");
    inputMatrix(&matrix1[0][0], rows, cols);

    printf("Enter elements for the second matrix:\n");
    inputMatrix(&matrix2[0][0], rows, cols);

    // Add matrices using pointers
    addMatrices(&matrix1[0][0], &matrix2[0][0], &resultMatrix[0][0], rows, cols);

    // Display the result matrix
    printf("Resultant Matrix:\n");
    printMatrix(&resultMatrix[0][0], rows, cols);

    return 0;
}

// Function to input elements for a matrix using pointers
void inputMatrix(int *matrix, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            scanf("%d", (matrix + i * cols + j));
        }
    }
}

// Function to add two matrices using pointers
void addMatrices(int *mat1, int *mat2, int *result, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            *(result + i * cols + j) = *(mat1 + i * cols + j) + *(mat2 + i * cols + j);
        }
    }
}

// Function to print a matrix using pointers
void printMatrix(int *matrix, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", *(matrix + i * cols + j));
        }
        printf("\n");
    }
}