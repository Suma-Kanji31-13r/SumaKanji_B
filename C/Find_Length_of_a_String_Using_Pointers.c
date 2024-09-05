#include <stdio.h>

// Function declaration
int stringLength(char *str);

int main() {
    char str[100];

    // Input string from the user
    printf("Enter a string: ");
    scanf("%s", str);

    // Calculate and display the length of the string using pointers
    printf("Length of the string: %d\n", stringLength(str));

    return 0;
}

// Function to calculate the length of a string using pointers
int stringLength(char *str) {
    int length = 0;

    while (*str != '\0') {
        length++;
        str++;
    }

    return length;
}
