#include <stdio.h>

int main() {
    int n, searchElement;

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

    // Get the element to search for
    printf("Enter the element to search for: ");
    scanf("%d", &searchElement);

    // Search for the element in the array
    int found = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] == searchElement) {
            found = 1;
            printf("Element found at position %d.\n", i + 1);
            break;
        }
    }

    if (!found) {
        printf("Element not found in the array.\n");
    }

    return 0;
}
