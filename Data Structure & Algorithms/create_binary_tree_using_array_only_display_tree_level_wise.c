#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define MAX_SIZE 100  // Maximum size of the array that will store the tree

// Function to print the binary tree level-wise
void printLevelOrder(int tree[], int count) {
    int totalLevels = (int)(log2(count + 1)); // Calculate number of levels in the tree
    int level, i, start, end;

    printf("Level-wise display of the tree:\n");
    for (level = 0; level <= totalLevels; level++) {
        start = (int)pow(2, level) - 1;
        end = (int)pow(2, level + 1) - 2;
        end = (end < count) ? end : count - 1;

        printf("Level %d: ", level);
        for (i = start; i <= end; i++) {
            printf("%d ", tree[i]);
        }
        printf("\n");
    }
}

int main() {
    int tree[MAX_SIZE];  // Array to store the elements of the binary tree
    int count = 0, data, i;

    printf("Enter the number of elements in the binary tree (max %d): ", MAX_SIZE);
    scanf("%d", &count);

    if (count > MAX_SIZE) {
        printf("Input exceeds maximum array size!\n");
        return -1;
    }

    printf("Enter the elements of the binary tree:\n");
    for (i = 0; i < count; i++) {
        scanf("%d", &data);
        tree[i] = data;
    }

    printLevelOrder(tree, count);

    return 0;
}
