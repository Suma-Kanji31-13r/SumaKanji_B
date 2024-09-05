#include <stdio.h>

int main() {
    int decimal, i = 0;
    int binary[32]; // Assuming a 32-bit binary representation

    // Get the decimal number from the user
    printf("Enter a decimal number: ");
    scanf("%d", &decimal);

    // Convert decimal to binary
    while (decimal > 0) {
        binary[i] = decimal % 2;
        decimal = decimal / 2;
        i++;
    }

    // Display the binary representation stored in the array
    printf("\nBinary Representation: ");
    for (int j = i - 1; j >= 0; j--) {
        printf("%d", binary[j]);
    }

    return 0;
}
