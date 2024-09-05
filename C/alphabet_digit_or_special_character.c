#include <stdio.h>

int main() {
    char ch;

    // Get user input for the character
    printf("Enter a character: ");
    scanf(" %c", &ch);

    // Check if the character is an alphabet, digit, or special character
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        printf("%c is an alphabet.\n", ch);
    else if (ch >= '0' && ch <= '9')
        printf("%c is a digit.\n", ch);
    else
        printf("%c is a special character.\n", ch);

    return 0;
}
