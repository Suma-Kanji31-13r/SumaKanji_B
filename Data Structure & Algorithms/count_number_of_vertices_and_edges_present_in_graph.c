#include <stdio.h>
#include <stdlib.h>

int main() {
    int vertices, i, j;
    int edgeCount = 0;

    printf("Enter the number of vertices in the graph: ");
    scanf("%d", &vertices);

    // Create a 2D array (adjacency matrix)
    int **adjMatrix = (int **)malloc(vertices * sizeof(int *));
    for (i = 0; i < vertices; i++) {
        adjMatrix[i] = (int *)malloc(vertices * sizeof(int));
    }

    // Initialize the matrix to zero
    for (i = 0; i < vertices; i++) {
        for (j = 0; j < vertices; j++) {
            adjMatrix[i][j] = 0;
        }
    }

    // Input edges from user
    printf("Enter the adjacency matrix for the graph:\n");
    for (i = 0; i < vertices; i++) {
        for (j = 0; j < vertices; j++) {
            scanf("%d", &adjMatrix[i][j]);
        }
    }

    // Count the number of edges
    for (i = 0; i < vertices; i++) {
        for (j = 0; j < vertices; j++) {
            if (adjMatrix[i][j] == 1) {
                if (i == j) {
                    edgeCount++; // Loop edge
                } else {
                    edgeCount++;
                }
            }
        }
    }

    printf("The graph has %d vertices.\n", vertices);
    printf("The graph has %d edges.\n", edgeCount);

    // Free the memory
    for (i = 0; i < vertices; i++) {
        free(adjMatrix[i]);
    }
    free(adjMatrix);

    return 0;
}
