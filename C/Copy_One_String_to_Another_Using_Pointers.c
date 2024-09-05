#include <stdio.h>

// Function declaration
void stringCopy(char *source, char *destination);

int main() {
    char source[100], destination[100];

    // Input string from the user
    printf("Enter a string to copy: ");
    scanf("%s", source);

    // Copy string using pointers
    stringCopy(source, destination);

    // Display the copied string
    printf("Copied string: %s\n", destination);

    return 0;
}

// Function to copy a string to another using pointers
void stringCopy(char *source, char *destination) {
    while (*source != '\0') {
        *destination = *source;
        source++;
        destination++;
    }
    *destination = '\0'; // Add the null character at the end of the destination string
}
