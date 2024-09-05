#include <stdio.h>

int main() {
    int n, pos;

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

    // Get the position to delete
    printf("Enter the position to delete: ");
    scanf("%d", &pos);

    // Shift elements to remove the element at the specified position
    for (int i = pos - 1; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }

    // Decrement the size of the array
    n--;

    // Display the updated array
    printf("\nUpdated Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
