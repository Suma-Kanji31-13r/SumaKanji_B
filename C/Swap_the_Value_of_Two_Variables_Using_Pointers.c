#include <stdio.h>

// Function declaration
void swap(int *a, int *b);

int main() {
    int num1, num2;

    // Get user input
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Display values before swapping
    printf("Before swapping: num1 = %d, num2 = %d\n", num1, num2);

    // Swap values using pointers
    swap(&num1, &num2);

    // Display values after swapping
    printf("After swapping: num1 = %d, num2 = %d\n", num1, num2);

    return 0;
}

// Function to swap the value of two variables using pointers
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
