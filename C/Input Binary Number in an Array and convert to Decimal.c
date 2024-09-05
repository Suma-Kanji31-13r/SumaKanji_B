#include <stdio.h>

int main() {
    int binary[32]; // Assuming a 32-bit binary representation
    int n;

    // Get the size of the binary array from the user
    printf("Enter the size of the binary array: ");
    scanf("%d", &n);

    // Input binary digits into the array
    printf("Enter the binary digits (0 or 1) in the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &binary[i]);
    }

    // Convert binary to decimal
    int decimal = 0;
    int base = 1;

    for (int i = n - 1; i >= 0; i--) {
        decimal += binary[i] * base;
        base *= 2;
    }

    // Display the decimal number
    printf("\nDecimal Number: %d\n", decimal);

    return 0;
}
