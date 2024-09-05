#include <stdio.h>

// Function declaration
void inputArray(int *arr, int size);
void printArray(int *arr, int size);

int main() {
    int size;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    // Input array elements using pointers
    printf("Enter the array elements:\n");
    inputArray(arr, size);

    // Print array elements using pointers
    printf("Array elements: ");
    printArray(arr, size);

    return 0;
}

// Function to input array elements using pointers
void inputArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        scanf("%d", (arr + i));
    }
}

// Function to print array elements using pointers
void printArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}
