#include <stdio.h>

int main() {
    int n, sum = 0;

    // Get user input for the upper limit
    printf("Enter a positive integer (n): ");
    scanf("%d", &n);

    for (int num = 2; num <= n; num++) {
        int isPrime = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime) {
            sum += num;
        }
    }

    printf("Sum of prime numbers between 1 and %d is: %d\n", n, sum);

    return 0;
}
