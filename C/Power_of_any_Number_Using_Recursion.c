#include <stdio.h>

// Function declaration
double power(int base, int exponent);

int main() {
    int base, exponent;

    // Get user input
    printf("Enter the base: ");
    scanf("%d", &base);

    printf("Enter the exponent: ");
    scanf("%d", &exponent);

    // Calculate and display the power
    printf("%d ^ %d = %.2f\n", base, exponent, power(base, exponent));

    return 0;
}

// Recursive function to find the power of a number
double power(int base, int exponent) {
    // Base case: any number to the power of 0 is 1
    if (exponent == 0) {
        return 1.0;
    } else {
        // Recursive case: base ^ exponent = base * base ^ (exponent - 1)
        return base * power(base, exponent - 1);
    }
}
