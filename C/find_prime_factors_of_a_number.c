#include <stdio.h>

int main() {
    int num;

    // Get user input for the number
    printf("Enter a positive integer: ");
    scanf("%d", &num);

    printf("Prime factors of %d are:\n", num);

    // Find and print prime factors
    for (int i = 2; i <= num; i++) {
        while (num % i == 0) {
            printf("%d ", i);
            num /= i;
        }
    }

    return 0;
}
