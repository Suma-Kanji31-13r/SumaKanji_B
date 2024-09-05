#include <stdio.h>

int main() {
    int num1, num2, lcm, max;

    // Get user input for the two numbers
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    // Find maximum of two numbers
    max = (num1 > num2) ? num1 : num2;

    // Calculate LCM using a for loop
    for (lcm = max; ; lcm += max) {
        if (lcm % num1 == 0 && lcm % num2 == 0)
            break;
    }

    printf("LCM of %d and %d is %d\n", num1, num2, lcm);

    return 0;
}
