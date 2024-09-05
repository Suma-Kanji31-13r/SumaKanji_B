#include <stdio.h>

// Function declaration
int stringCompare(char *str1, char *str2);

int main() {
    char str1[100], str2[100];

    // Input strings from the user
    printf("Enter the first string: ");
    scanf("%s", str1);

    printf("Enter the second string: ");
    scanf("%s", str2);

    // Compare strings using pointers
    int result = stringCompare(str1, str2);

    // Display the comparison result
    if (result == 0) {
        printf("Strings are equal.\n");
    } else if (result < 0) {
        printf("String 1 is less than String 2.\n");
    } else {
        printf("String 1 is greater than String 2.\n");
    }

    return 0;
}

// Function to compare two strings using pointers
int stringCompare(char *str1, char *str2) {
    while (*str1 == *str2) {
        if (*str1 == '\0' && *str2 == '\0') {
            return 0; // Strings are equal
        }
        str1++;
        str2++;
    }

    return *str1 - *str2; // Return the ASCII difference
}
