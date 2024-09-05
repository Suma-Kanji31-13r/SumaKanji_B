#include <stdio.h>

void printArray(int array[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

// Function to swap two elements
void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}

// Partition function for quicksort
int partition(int array[], int low, int high) {
    int pivot = array[high];  // Pivot element
    int i = (low - 1);  // Index of smaller element

    for (int j = low; j <= high - 1; j++) {
        // If current element is smaller than or equal to pivot
        if (array[j] <= pivot) {
            i++;  // Increment index of smaller element
            swap(&array[i], &array[j]);
        }
    }
    swap(&array[i + 1], &array[high]);
    return (i + 1);
}

// QuickSort function
void quickSort(int array[], int low, int high) {
    if (low < high) {
        // pi is partitioning index, array[p] is now at right place
        int pi = partition(array, low, high);

        printf("Array after partitioning from %d to %d: ", low, high);
        printArray(array, high + 1);  // Print the state of the array after partitioning

        // Separately sort elements before and after partition
        quickSort(array, low, pi - 1);
        quickSort(array, pi + 1, high);
    }
}

int main() {
    int data[] = {27, 15, 39, 21, 28, 70};
    int n = sizeof(data) / sizeof(data[0]);

    printf("Original data set:\n");
    printArray(data, n);

    quickSort(data, 0, n - 1);

    printf("\nSorted Array:\n");
    printArray(data, n);

    return 0;
}
