#include <stdio.h>

// Function declaration
int sumOfDigits(int num);

int main() {
    int number;

    // Get user input
    printf("Enter an integer number: ");
    scanf("%d", &number);

    // Calculate and display the sum of digits
    printf("Sum of digits: %d\n", sumOfDigits(number));

    return 0;
}

// Recursive function to calculate the sum of digits
int sumOfDigits(int num) {
    // Base case: if the number is a single digit
    if (num < 10) {
        return num;
    } else {
        // Recursive case: sum of digits = last digit + sum of digits in the remaining number
        return num % 10 + sumOfDigits(num / 10);
    }
}
