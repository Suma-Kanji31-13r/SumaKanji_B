#include <stdio.h>

int main() {
    int num;

    // Get user input for the number
    printf("Enter a positive integer: ");
    scanf("%d", &num);

    // Display all factors of the number
    printf("Factors of %d are: ", num);
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            printf("%d ", i);
        }
    }

    return 0;
}
