#include <stdio.h>

void insertionSort(int array[], int size) {
    int i, j, key;

    // Iterate through the array
    for (i = 1; i < size; i++) {
        key = array[i]; // The element to be positioned
        j = i - 1;

        /* Move elements of array[0..i-1], that are greater than key,
           to one position ahead of their current position */
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key; // Place key at after the last swapped item

        // Print the array after each iteration
        printf("Array after iteration %d: ", i);
        for (int k = 0; k < size; k++) {
            printf("%d ", array[k]);
        }
        printf("\n");
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

    // Perform the insertion sort
    insertionSort(data, n);

    printf("\nSorted Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");

    return 0;
}
