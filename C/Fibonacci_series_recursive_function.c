#include <stdio.h>

// Function declaration
int fibonacci(int n);

int main() {
    int terms;

    // Get the number of terms for the Fibonacci series
    printf("Enter the number of terms for the Fibonacci series: ");
    scanf("%d", &terms);

    // Display the Fibonacci series
    printf("Fibonacci Series:\n");
    for (int i = 0; i < terms; i++) {
        printf("%d ", fibonacci(i));
    }

    return 0;
}

// Recursive function to generate the nth Fibonacci number
int fibonacci(int n) {
    // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
