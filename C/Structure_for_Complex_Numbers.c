#include <stdio.h>

// Define the structure
typedef struct {
    double real;
    double imaginary;
} Complex;

int main() {
    // Declare variables of type Complex
    Complex num1, num2, sum, diff;

    // Read complex numbers from the user
    printf("Enter the real and imaginary parts of the first complex number: ");
    scanf("%lf %lf", &num1.real, &num1.imaginary);

    printf("Enter the real and imaginary parts of the second complex number: ");
    scanf("%lf %lf", &num2.real, &num2.imaginary);

    // Perform addition and subtraction
    sum.real = num1.real + num2.real;
    sum.imaginary = num1.imaginary + num2.imaginary;

    diff.real = num1.real - num2.real;
    diff.imaginary = num1.imaginary - num2.imaginary;

    // Display the result
    printf("\nSum of the complex numbers: %.2lf + %.2lfi\n", sum.real, sum.imaginary);
    printf("Difference of the complex numbers: %.2lf + %.2lfi\n", diff.real, diff.imaginary);

    return 0;
}
