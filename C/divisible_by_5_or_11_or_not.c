#include <stdio.h>

int main() {
    int num;

    // Get user input for the number
    printf("Enter an integer: ");
    scanf("%d", &num);

    // Check if the number is divisible by 5 and 11
    if (num % 5 == 0 && num % 11 == 0)
        printf("%d is divisible by both 5 and 11.\n", num);
    else
        printf("%d is not divisible by both 5 and 11.\n", num);

    return 0;
}
