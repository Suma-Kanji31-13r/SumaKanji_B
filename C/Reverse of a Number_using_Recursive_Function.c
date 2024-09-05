#include <stdio.h>
#include <math.h>
// Function declaration
int reverseNumber(int num);

int main() {
    int number;

    // Get user input
    printf("Enter an integer number: ");
    scanf("%d", &number);

    // Calculate and display the reverse of the number
    printf("Reverse of the number: %d\n", reverseNumber(number));

    return 0;
}

// Recursive function to reverse a number
int reverseNumber(int num) {
    // Base case: if the number is a single digit
    if (num < 10) {
        return num;
    } else {
        // Recursive case: reverse = last digit * 10^(number of digits - 1) + reverse of the remaining number
        int numDigits = 0;
        int temp = num;

        // Count the number of digits in the number
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        // Calculate the reverse using the recursive formula
        return (num % 10) * pow(10, numDigits - 1) + reverseNumber(num / 10);
    }
}
