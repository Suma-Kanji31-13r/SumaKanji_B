#include <stdio.h>
#include <dirent.h>

int main() {
    DIR *dir;
    struct dirent *entry;

    // Open the current directory
    dir = opendir(".");

    // Check if the directory is opened successfully
    if (dir == NULL) {
        printf("Error opening directory.\n");
        return 1;
    }

    // Read and print all files and sub-directories in the directory
    while ((entry = readdir(dir)) != NULL) {
        printf("%s\n", entry->d_name);
    }

    // Close the directory
    closedir(dir);

    return 0;
}
