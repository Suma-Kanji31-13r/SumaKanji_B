#include <stdio.h>

int main() {
    int n, pos, value;

    // Get the size of the array from the user
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    // Declare an array
    int arr[100];

    // Input elements in the array
    printf("Enter elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Get the position and value to insert
    printf("Enter the position to insert: ");
    scanf("%d", &pos);

    printf("Enter the value to insert: ");
    scanf("%d", &value);

    // Shift elements to make space for the new element
    for (int i = n - 1; i >= pos - 1; i--) {
        arr[i + 1] = arr[i];
    }

    // Insert the value at the specified position
    arr[pos - 1] = value;

    // Increment the size of the array
    n++;

    // Display the updated array
    printf("\nUpdated Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
