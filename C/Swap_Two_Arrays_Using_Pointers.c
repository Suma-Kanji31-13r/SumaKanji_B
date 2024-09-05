#include <stdio.h>

// Function declaration
void swapArrays(int *arr1, int *arr2, int size);

int main() {
    int size;

    // Get the size of the arrays
    printf("Enter the size of the arrays: ");
    scanf("%d", &size);

    int array1[size];
    int array2[size];

    // Input array elements
    printf("Enter the first array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array1[i]);
    }

    printf("Enter the second array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array2[i]);
    }

    // Swap arrays using pointers
    swapArrays(array1, array2, size);

    // Display the swapped arrays
    printf("Swapped arrays:\n");
    printf("Array 1: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array1[i]);
    }
    printf("\nArray 2: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array2[i]);
    }

    return 0;
}

// Function to swap arrays using pointers
void swapArrays(int *arr1, int *arr2, int size) {
    for (int i = 0; i < size; i++) {
        // Swap elements using a temporary variable
        int temp = *(arr1 + i);
        *(arr1 + i) = *(arr2 + i);
        *(arr2 + i) = temp;
    }
}
