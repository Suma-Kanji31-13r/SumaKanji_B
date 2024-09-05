#include<stdio.h>

int main() {
    int num, digit, frequency[10] = {0};

    printf("Enter an integer: ");
    scanf("%d", &num);

    // Count frequency of each digit
    while (num > 0) {
        digit = num % 10;
        frequency[digit]++;
        num /= 10;
    }

    // Display the frequency of each digit
    printf("Frequency of each digit:\n");
    for (int i = 0; i < 10; i++) {
        if (frequency[i] > 0) {
            printf("Digit %d: %d times\n", i, frequency[i]);
        }
    }

    return 0;
}
