#include <stdio.h>
#include <stdbool.h>

#define MAX_VERTICES 6

// Graph representation using adjacency matrix
int graph[MAX_VERTICES][MAX_VERTICES] = {
    {0, 1, 1, 0, 0, 0}, // P
    {1, 0, 0, 1, 0, 0}, // Q
    {1, 0, 0, 1, 1, 0}, // R
    {0, 1, 1, 0, 0, 1}, // S
    {0, 0, 1, 0, 0, 1}, // T
    {0, 0, 0, 1, 1, 0}  // U
};

bool visited[MAX_VERTICES] = {false};

// BFS traversal
void bfs(int start) {
    int queue[MAX_VERTICES];
    int front = 0, rear = 0;

    visited[start] = true;
    queue[rear++] = start;

    while (front < rear) {
        int current = queue[front++];
        printf("%c ", 'P' + current); // Print the vertex (e.g., P, Q, R, ...)

        for (int neighbor = 0; neighbor < MAX_VERTICES; ++neighbor) {
            if (graph[current][neighbor] && !visited[neighbor]) {
                visited[neighbor] = true;
                queue[rear++] = neighbor;
            }
        }
    }
}

int main() {
    printf("Breadth First Traversal: ");
    bfs(0); // Start from vertex P (index 0)
    printf("\n");

    return 0;
}