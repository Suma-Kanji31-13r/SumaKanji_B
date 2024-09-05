#include <stdio.h>

int main() {
    int num1, num2, hcf;

    // Get user input for the two numbers
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    // Calculate HCF using Euclidean algorithm
    while (num1 != num2) {
        if (num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
    }

    hcf = num1;

    printf("HCF (GCD) of %d and %d is %d\n", num1, num2, hcf);

    return 0;
}
