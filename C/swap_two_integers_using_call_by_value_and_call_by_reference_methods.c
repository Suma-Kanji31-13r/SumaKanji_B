#include <stdio.h>

// Function declarations
void swapByValue(int a, int b);
void swapByReference(int *a, int *b);

int main() {
    int num1, num2;

    // Get user input
    printf("Enter the first integer: ");
    scanf("%d", &num1);

    printf("Enter the second integer: ");
    scanf("%d", &num2);

    // Call swapByValue and display the result
    printf("\nUsing Call by Value:\n");
    printf("Before swapping: num1 = %d, num2 = %d\n", num1, num2);
    swapByValue(num1, num2);
    printf("After swapping: num1 = %d, num2 = %d\n", num1, num2);

    // Call swapByReference and display the result
    printf("\nUsing Call by Reference:\n");
    printf("Before swapping: num1 = %d, num2 = %d\n", num1, num2);
    swapByReference(&num1, &num2);
    printf("After swapping: num1 = %d, num2 = %d\n", num1, num2);

    return 0;
}

// Function to swap two integers using call by value
void swapByValue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

// Function to swap two integers using call by reference
void swapByReference(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
