#include <stdio.h>

// Function declaration
int sumOfFirstN(int n);

int main() {
    int n = 20;
    
    // Calculate and display the sum of the first 20 natural numbers
    printf("Sum of the first %d natural numbers: %d\n", n, sumOfFirstN(n));

    return 0;
}

// Recursive function to calculate the sum of the first N natural numbers
int sumOfFirstN(int n) {
    // Base case: sum of first 0 natural numbers is 0
    if (n == 0) {
        return 0;
    } else {
        // Recursive case: sum of first N natural numbers is N + sum of first (N-1) natural numbers
        return n + sumOfFirstN(n - 1);
    }
}
