#include <stdio.h>

int main() {
    FILE *file;
    char filename[100];
    char ch;

    // Get the filename from the user
    printf("Enter the filename: ");
    scanf("%s", filename);

    // Open the file
    file = fopen(filename, "r");

    // Check if the file is opened successfully
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    // Read and print the contents of the file
    while ((ch = fgetc(file)) != EOF) {
        printf("%c", ch);
    }

    // Close the file
    fclose(file);

    return 0;
}
