#include <stdio.h>

// Function declaration
int findSum(int *arr, int size);

int main() {
    int size;

    // Get the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    // Get array elements from the user
    printf("Enter the array elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    // Calculate and display the sum of array elements using pointers
    printf("Sum of array elements: %d\n", findSum(arr, size));

    return 0;
}

// Function to find the sum of array elements using pointers
int findSum(int *arr, int size) {
    int sum = 0;

    // Use pointers to iterate through the array and calculate the sum
    for (int i = 0; i < size; i++) {
        sum += *(arr + i);
    }

    return sum;
}
