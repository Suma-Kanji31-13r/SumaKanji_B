#include <stdio.h>

int main() {
    int N, sum = 0;

    // Get user input for the number of terms (N)
    printf("Enter the number of terms (N): ");
    scanf("%d", &N);

    // Display the N terms of odd numbers and calculate their sum
    printf("The first %d odd numbers are:\n", N);

    for (int i = 1; i <= N; i++) {
        int oddNumber = 2 * i - 1;
        sum += oddNumber;
        printf("%d ", oddNumber);
    }

    printf("\nSum of the first %d odd numbers: %d\n", N, sum);

    return 0;
}
