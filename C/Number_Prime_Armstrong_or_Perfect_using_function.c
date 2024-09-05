#include <stdio.h>
#include <math.h>

// Function declarations
int isPrime(int num);
int isArmstrong(int num);
int isPerfect(int num);

int main() {
    int number;

    // Get user input
    printf("Enter an integer number: ");
    scanf("%d", &number);

    // Check and display whether the number is prime, Armstrong, or perfect
    if (isPrime(number)) {
        printf("%d is a prime number.\n", number);
    } else {
        printf("%d is not a prime number.\n", number);
    }

    if (isArmstrong(number)) {
        printf("%d is an Armstrong number.\n", number);
    } else {
        printf("%d is not an Armstrong number.\n", number);
    }

    if (isPerfect(number)) {
        printf("%d is a perfect number.\n", number);
    } else {
        printf("%d is not a perfect number.\n", number);
    }

    return 0;
}

// Function to check whether a number is prime
int isPrime(int num) {
    if (num < 2) {
        return 0; // Not a prime number
    }
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {
            return 0; // Not a prime number
        }
    }
    return 1; // Prime number
}

// Function to check whether a number is Armstrong
int isArmstrong(int num) {
    int originalNum, remainder, n = 0, result = 0;
    originalNum = num;

    while (originalNum != 0) {
        originalNum /= 10;
        ++n;
    }

    originalNum = num;
    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += pow(remainder, n);
        originalNum /= 10;
    }

    if (result == num) {
        return 1; // Armstrong number
    } else {
        return 0; // Not an Armstrong number
    }
}

// Function to check whether a number is perfect
int isPerfect(int num) {
    int sum = 1; // Initialize sum to 1 because every number is divisible by 1

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    if (sum == num) {
        return 1; // Perfect number
    } else {
        return 0; // Not a perfect number
    }
}
