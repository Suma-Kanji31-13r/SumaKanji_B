#include <stdio.h>

int main() {
    int num1, num2;

    // Get user input for the two numbers
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Find the maximum between the two numbers
    if (num1 > num2)
        printf("Maximum: %d\n", num1);
    else if (num2 > num1)
        printf("Maximum: %d\n", num2);
    else
        printf("Both numbers are equal.\n");

    return 0;
}
