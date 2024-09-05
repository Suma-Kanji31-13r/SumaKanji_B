#include <stdio.h>

// Function declaration
void copyArray(int *source, int *destination, int size);

int main() {
    int size;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int sourceArray[size];
    int destinationArray[size];

    // Input array elements
    printf("Enter the source array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &sourceArray[i]);
    }

    // Copy array elements using pointers
    copyArray(sourceArray, destinationArray, size);

    // Display the copied array elements
    printf("Copied array elements: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", destinationArray[i]);
    }

    return 0;
}

// Function to copy array elements using pointers
void copyArray(int *source, int *destination, int size) {
    for (int i = 0; i < size; i++) {
        *(destination + i) = *(source + i);
    }
}
