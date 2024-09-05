#include <stdio.h>
#include <math.h>

int main() {
    int n, num, originalNum, remainder, digits, result;

    // Get user input for the upper limit
    printf("Enter a positive integer (n): ");
    scanf("%d", &n);

    printf("Armstrong numbers between 1 and %d are:\n", n);

    for (int i = 1; i <= n; i++) {
        num = i;
        originalNum = i;
        digits = 0;
        result = 0;

        // Count the number of digits
        while (originalNum != 0) {
            originalNum /= 10;
            ++digits;
        }

        originalNum = num;

        // Check if the number is an Armstrong number
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += pow(remainder, digits);
            originalNum /= 10;
        }

        if (result == num) {
            printf("%d\n", num);
        }
    }

    return 0;
}
