#include <stdio.h>

// Function declaration
void stringConcatenate(char *str1, char *str2);

int main() {
    char str1[100], str2[100];

    // Input strings from the user
    printf("Enter the first string: ");
    scanf("%s", str1);

    printf("Enter the second string: ");
    scanf("%s", str2);

    // Concatenate strings using pointers
    stringConcatenate(str1, str2);

    // Display the concatenated string
    printf("Concatenated string: %s\n", str1);

    return 0;
}

// Function to concatenate two strings using pointers
void stringConcatenate(char *str1, char *str2) {
    // Move to the end of the first string
    while (*str1 != '\0') {
        str1++;
    }

    // Copy the second string to the end of the first string
    while (*str2 != '\0') {
        *str1 = *str2;
        str1++;
        str2++;
    }

    *str1 = '\0'; // Add the null character at the end of the concatenated string
}
