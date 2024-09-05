#include <stdio.h>

int main() {
    int num, count = 0;

    // Get user input for the number
    printf("Enter an integer: ");
    scanf("%d", &num);

    // Count the number of digits
    while (num != 0) {
        num /= 10;
        count++;
    }

    printf("Number of digits: %d\n", count);

    return 0;
}
