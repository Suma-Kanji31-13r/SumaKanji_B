#include <stdio.h>

// Function declaration
int add(int *a, int *b);

int main() {
    int num1, num2;

    // Get user input
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Calculate and display the sum using pointers
    printf("Sum: %d\n", add(&num1, &num2));

    return 0;
}

// Function to add two numbers using pointers
int add(int *a, int *b) {
    return (*a) + (*b);
}
