#include <stdio.h>

// Function declaration
int searchElement(int *arr, int size, int key);

int main() {
    int size, key;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int array[size];

    // Input array elements
    printf("Enter the array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    // Get the element to search
    printf("Enter the element to search: ");
    scanf("%d", &key);

    // Search for the element using pointers
    int result = searchElement(array, size, key);

    // Display the search result
    if (result != -1) {
        printf("%d found at index %d.\n", key, result);
    } else {
        printf("%d not found in the array.\n", key);
    }

    return 0;
}

// Function to search for an element in an array using pointers
int searchElement(int *arr, int size, int key) {
    for (int i = 0; i < size; i++) {
        if (*(arr + i) == key) {
            return i; // Return the index if the element is found
        }
    }
    return -1; // Return -1 if the element is not found
}
