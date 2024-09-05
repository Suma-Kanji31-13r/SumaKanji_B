#include <stdio.h>

#define MAX_VERTICES 100

// Function to check if the graph is complete
int isComplete(int graph[MAX_VERTICES][MAX_VERTICES], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j) {
                // For a complete graph, there should be an edge between every pair of distinct vertices
                if (graph[i][j] == 0) {
                    return 0; // Not complete
                }
            } else {
                // Diagonal elements should be 0, indicating no self-loops
                if (graph[i][j] != 0) {
                    return 0; // Not complete
                }
            }
        }
    }
    return 1; // Complete
}

int main() {
    int n;
    printf("Enter the number of vertices in the graph: ");
    scanf("%d", &n);

    int graph[MAX_VERTICES][MAX_VERTICES];

    printf("Enter the adjacency matrix of the graph:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    if (isComplete(graph, n)) {
        printf("The graph is complete.\n");
    } else {
        printf("The graph is not complete.\n");
    }

    return 0;
}