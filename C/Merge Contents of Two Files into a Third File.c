#include <stdio.h>

int main() {
    FILE *file1, *file2, *mergedFile;
    char filename1[100], filename2[100], mergedFilename[100];
    char ch;

    // Get the filenames from the user
    printf("Enter the first filename: ");
    scanf("%s", filename1);

    printf("Enter the second filename: ");
    scanf("%s", filename2);

    // Open the first file
    file1 = fopen(filename1, "r");

    // Check if the first file is opened successfully
    if (file1 == NULL) {
        printf("Error opening first file.\n");
        return 1;
    }

    // Open the second file
    file2 = fopen(filename2, "r");

    // Check if the second file is opened successfully
    if (file2 == NULL) {
        printf("Error opening second file.\n");
        fclose(file1);
        return 1;
    }

    // Get the merged filename from the user
    printf("Enter the merged filename: ");
    scanf("%s", mergedFilename);

    // Open the merged file for writing
    mergedFile = fopen(mergedFilename, "w");

    // Check if the merged file is opened successfully
    if (mergedFile == NULL) {
        printf("Error opening merged file.\n");
        fclose(file1);
        fclose(file2);
        return 1;
    }

    // Merge contents from the first and second files into the merged file
    while ((ch = fgetc(file1)) != EOF) {
        fputc(ch, mergedFile);
    }

    while ((ch = fgetc(file2)) != EOF) {
        fputc(ch, mergedFile);
    }

    // Close all files
    fclose(file1);
    fclose(file2);
    fclose(mergedFile);

    printf("Files merged successfully.\n");

    return 0;
}
