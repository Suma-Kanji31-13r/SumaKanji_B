#include <stdio.h>

int main() {
    char filename[100];

    // Get the filename from the user
    printf("Enter the filename to delete: ");
    scanf("%s", filename);

    // Delete the file
    if (remove(filename) == 0) {
        printf("File deleted successfully.\n");
    } else {
        printf("Error deleting file.\n");
    }

    return 0;
}
