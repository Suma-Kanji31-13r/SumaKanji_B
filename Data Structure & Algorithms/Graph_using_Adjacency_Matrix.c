#include <stdio.h>

#define MAX_VERTICES 6
void dfs(int adjacency_matrix[MAX_VERTICES][MAX_VERTICES], int node, int visited[]);

// Rest of your code

// Function to print the nodes of the graph
void print_nodes(int adjacency_matrix[MAX_VERTICES][MAX_VERTICES], int num_vertices) {
  int visited[MAX_VERTICES];

  // Initialize all visited nodes to 0 (not visited)
  for (int i = 0; i < num_vertices; i++) {
    visited[i] = 0;
  }

  // Start DFS traversal from the first node (or any node you prefer)
  printf("Nodes: ");
  dfs(adjacency_matrix, 0, visited);  // You can start from any node here (e.g., 2 for node 'R')
  printf("\n");
}

// Depth-First Search traversal
void dfs(int adjacency_matrix[MAX_VERTICES][MAX_VERTICES], int node, int visited[]) {
  visited[node] = 1;  // Mark the current node as visited
  printf("%c ", node + 'P');  

  // Visit all unvisited neighbors
  for (int i = 0; i < MAX_VERTICES; i++) {
    if (adjacency_matrix[node][i] != 0 && !visited[i]) {
      dfs(adjacency_matrix, i, visited);
    }
  }
}

int main() {
  int adjacency_matrix[MAX_VERTICES][MAX_VERTICES] = {
    {0, 1, 1, 0, 0, 0},  // Node P connections
    {1, 0, 0, 4, 1, 1},  // Node Q connections
    {1, 0, 0, 2, 0, 0},  // Node R connections
    {0, 4, 2, 0, 3, 0},  // Node S connections
    {0, 1, 0, 3, 0, 2},  // Node T connections
    {0, 1, 0, 0, 2, 0}   // Node U connections
  };

  int num_vertices = 6;

  print_nodes(adjacency_matrix, num_vertices);

  return 0;
}
