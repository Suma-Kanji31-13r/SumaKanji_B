#include <stdio.h>

int main() {
    FILE *sourceFile, *destinationFile;
    char sourceFilename[100], destinationFilename[100];
    char ch;

    // Get the source filename from the user
    printf("Enter the source filename: ");
    scanf("%s", sourceFilename);

    // Open the source file
    sourceFile = fopen(sourceFilename, "r");

    // Check if the source file is opened successfully
    if (sourceFile == NULL) {
        printf("Error opening source file.\n");
        return 1;
    }

    // Get the destination filename from the user
    printf("Enter the destination filename: ");
    scanf("%s", destinationFilename);

    // Open the destination file for writing
    destinationFile = fopen(destinationFilename, "w");

    // Check if the destination file is opened successfully
    if (destinationFile == NULL) {
        printf("Error opening destination file.\n");
        fclose(sourceFile);
        return 1;
    }

    // Copy contents from source file to destination file
    while ((ch = fgetc(sourceFile)) != EOF) {
        fputc(ch, destinationFile);
    }

    // Close both files
    fclose(sourceFile);
    fclose(destinationFile);

    printf("File copy successful.\n");

    return 0;
}
