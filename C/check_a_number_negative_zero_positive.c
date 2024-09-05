#include <stdio.h>

int main() {
    int num;

    // Get user input for the number
    printf("Enter an integer: ");
    scanf("%d", &num);

    // Check if the number is negative, positive, or zero
    if (num > 0)
        printf("The entered number is positive.\n");
    else if (num < 0)
        printf("The entered number is negative.\n");
    else
        printf("The entered number is zero.\n");

    return 0;
}
