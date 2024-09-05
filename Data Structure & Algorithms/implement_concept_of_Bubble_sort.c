#include <stdio.h>

void bubbleSort(int array[], int size) {
    int temp;
    int didSwap; // This variable is used to check if swaps were made during the inner loop

    // Loop through all numbers 
    for (int i = 0; i < size - 1; i++) {
        didSwap = 0; // Reset swap flag for each outer loop iteration
        // Loop through numbers falling ahead
        for (int j = 0; j < size - 1 - i; j++) {
            // Check if the current number is greater than the next number
            if (array[j] > array[j + 1]) {
                // Swap the numbers.
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                // Set the flag to true indicating we did a swap
                didSwap = 1;
            }
        }

        // Print the array after each outer loop iteration
        printf("Array after iteration %d: ", i + 1);
        for (int k = 0; k < size; k++) {
            printf("%d ", array[k]);
        }
        printf("\n");

        // If no swaps were made, the array is already sorted
        if (!didSwap) {
            break;
        }
    }
}

int main() {
    int data[] = {27, 15, 39, 21, 28, 70};
    int n = sizeof(data) / sizeof(data[0]);

    printf("Original data set:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", data[i]);
    }
    printf("\n\n");

    // Perform the bubble sort
    bubbleSort(data, n);

    printf("\nSorted Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");

    return 0;
}
