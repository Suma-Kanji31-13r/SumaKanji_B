#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 6

// Structure to represent a node in the adjacency list
struct Node {
  int data;
  struct Node* next;
};

// Structure to represent the adjacency list
struct Graph {
  int num_vertices;
  struct Node* head[MAX_VERTICES];
};

// Function to create a new node
struct Node* createNode(int data) {
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
  newNode->data = data;
  newNode->next = NULL;
  return newNode;
}

// Function to create a graph with num_vertices vertices
struct Graph* createGraph(int num_vertices) {
  struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
  graph->num_vertices = num_vertices;

  // Create an empty linked list for each vertex
  for (int i = 0; i < num_vertices; i++) {
    graph->head[i] = NULL;
  }

  return graph;
}

// Function to add an edge to the graph
void addEdge(struct Graph* graph, int source, int destination) {
  // Create a new node for the destination
  struct Node* newNode = createNode(destination);

  // Add the node to the linked list of the source vertex
  newNode->next = graph->head[source];
  graph->head[source] = newNode;
}

// Function prototype for DFS traversal (declared before usage)
void dfs(struct Graph* graph, int node, int visited[]);

// Function to print the graph using DFS traversal
void print_graph(struct Graph* graph, int start_node) {
  int visited[MAX_VERTICES];

  // Initialize all visited nodes to 0 (not visited)
  for (int i = 0; i < graph->num_vertices; i++) {
    visited[i] = 0;
  }

  dfs(graph, start_node, visited);
}

// Depth-First Search traversal
void dfs(struct Graph* graph, int node, int visited[]) {
  visited[node] = 1;  // Mark the current node as visited
  printf("%c ", node + 'P');  // Print the node label (assuming A, B, C, ...)

  // Recursively visit all unvisited neighbors
  struct Node* temp = graph->head[node];
  while (temp != NULL) {
    if (!visited[temp->data]) {
      dfs(graph, temp->data, visited);
    }
    temp = temp->next;
  }
}

int main() {
  // Create the graph using adjacency list representation (based on the image)
  int num_vertices = 6;
  struct Graph* graph = createGraph(num_vertices);
  addEdge(graph, 0, 1);  // Edge between P and Q
  addEdge(graph, 0, 2);  // Edge between P and R
  addEdge(graph, 1, 3);  // Edge between Q and S (weight 1)
  addEdge(graph, 1, 4);  // Edge between Q and T (weight 4)
  addEdge(graph, 1, 5);  // Edge between Q and U (weight 1)
  addEdge(graph, 2, 3);  // Edge between R and S (weight 2)
  addEdge(graph, 3, 4);  // Edge between S and T (weight 3)
  addEdge(graph, 4, 5);  // Edge between T and U (weight 2)

  // Print the graph
  printf("Graph (Adjacency List):\n");
  print_graph(graph, 0);  // You can start from any node here

  return 0;
}
