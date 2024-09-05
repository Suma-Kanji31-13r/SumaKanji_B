#include <stdio.h>

int main() {
    double base, exponent, result = 1;

    // Get user input for base and exponent
    printf("Enter base: ");
    scanf("%lf", &base);
    printf("Enter exponent: ");
    scanf("%lf", &exponent);

    // Calculate power using a for loop
    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }

    printf("Result: %.2lf\n", result);

    return 0;
}
