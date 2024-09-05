#include <stdio.h>

void selectionSort(int array[], int size) {
    int i, j, min_idx, temp;

    // Move through the unsorted segment of the array
    for (i = 0; i < size - 1; i++) {
        // Find the minimum element in the unsorted part
        min_idx = i;
        for (j = i + 1; j < size; j++) {
            if (array[j] < array[min_idx]) {
                min_idx = j;
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        temp = array[min_idx];
        array[min_idx] = array[i];
        array[i] = temp;

        // Print the array after each iteration
        printf("Array after iteration %d: ", i + 1);
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

    // Perform the selection sort
    selectionSort(data, n);

    printf("\nSorted Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");

    return 0;
}
