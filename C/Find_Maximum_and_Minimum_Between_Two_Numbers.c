#include <stdio.h>

// Function declarations
int findMax(int a, int b);
int findMin(int a, int b);

int main() {
    int num1, num2;

    // Get user input
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Find and display maximum and minimum
    printf("Maximum: %d\n", findMax(num1, num2));
    printf("Minimum: %d\n", findMin(num1, num2));

    return 0;
}

// Function to find the maximum between two numbers
int findMax(int a, int b) {
    return (a > b) ? a : b;
}

// Function to find the minimum between two numbers
int findMin(int a, int b) {
    return (a < b) ? a : b;
}
