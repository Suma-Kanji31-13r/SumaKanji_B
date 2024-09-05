#include <stdio.h>

int main() {
    int N;

    // Get user input for the upper limit N
    printf("Enter a positive integer (N): ");
    scanf("%d", &N);

    // Display the cube of numbers up to N
    printf("Cubes of numbers from 1 to %d are:\n", N);
    
    for (int i = 1; i <= N; i++) {
        int cube = i * i * i;
        printf("Cube of %d = %d\n", i, cube);
    }

    return 0;
}
