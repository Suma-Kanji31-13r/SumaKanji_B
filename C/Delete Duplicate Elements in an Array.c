#include <stdio.h>

int main() {
    int n;

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

    // Delete duplicate elements
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n;) {
            if (arr[i] == arr[j]) {
                for (int k = j; k < n - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                n--;
            } else {
                j++;
            }
        }
    }

    // Display the array after deleting duplicates
    printf("\nArray after deleting duplicates:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
