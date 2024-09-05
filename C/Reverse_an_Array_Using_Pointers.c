#include <stdio.h>

// Function declaration
void reverseArray(int *arr, int size);

int main() {
    int size;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int array[size];

    // Input array elements
    printf("Enter the array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    // Reverse the array using pointers
    reverseArray(array, size);

    // Display the reversed array
    printf("Reversed array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }

    return 0;
}

// Function to reverse an array using pointers
void reverseArray(int *arr, int size) {
    int start = 0;
    int end = size - 1;

    while (start < end) {
        // Swap elements at start and end positions
        int temp = *(arr + start);
        *(arr + start) = *(arr + end);
        *(arr + end) = temp;

        // Move the start index forward and the end index backward
        start++;
        end--;
    }
}
