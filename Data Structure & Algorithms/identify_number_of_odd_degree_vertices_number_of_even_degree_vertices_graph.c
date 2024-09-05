#include <stdio.h>

#define MAX_VERTICES 100

// Function to count and display number of vertices with odd and even degrees
void countOddEvenDegrees(int graph[MAX_VERTICES][MAX_VERTICES], int n) {
    int oddCount = 0, evenCount = 0;
    
    // Iterate through the adjacency matrix to find the degree of each vertex
    for (int i = 0; i < n; i++) {
        int degree = 0;
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == 1) { // Assuming 1 represents an edge between i and j
                degree++;
            }
        }
        if (degree % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    
    printf("Number of vertices with odd degree: %d\n", oddCount);
    printf("Number of vertices with even degree: %d\n", evenCount);
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

    countOddEvenDegrees(graph, n);

    return 0;
}