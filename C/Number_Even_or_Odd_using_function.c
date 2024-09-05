#include <stdio.h>

// Function declaration
void checkEvenOdd(int num);

int main() {
    int number;

    // Get user input
    printf("Enter an integer number: ");
    scanf("%d", &number);

    // Check and display whether the number is even or odd
    checkEvenOdd(number);

    return 0;
}

// Function to check whether a number is even or odd
void checkEvenOdd(int num) {
    if (num % 2 == 0) {
        printf("%d is even.\n", num);
    } else {
        printf("%d is odd.\n", num);
    }
}
