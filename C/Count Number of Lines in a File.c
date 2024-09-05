#include <stdio.h>

int main() {
    FILE *file;
    char filename[100];
    char ch;
    int lines = 0;

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

    // Count the number of lines in the file
    while ((ch = fgetc(file)) != EOF) {
        if (ch == '\n') {
            lines++;
        }
    }

    // Close the file
    fclose(file);

    // Display the number of lines
    printf("Number of lines in the file: %d\n", lines);

    return 0;
}
