#include <stdio.h>
#include <stdlib.h>

#define MAX 6

typedef struct node {
    int vertex;
    struct node* next;
} Node;

typedef struct graph {
    int numVertices;
    Node** adjLists;
} Graph;

Node* createNode(int v) {
    Node* newNode = malloc(sizeof(Node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

Graph* createGraph(int vertices) {
    Graph* graph = malloc(sizeof(Graph));
    graph->numVertices = vertices;
    graph->adjLists = malloc(vertices * sizeof(Node*));
    for (int i = 0; i < vertices; ++i)
        graph->adjLists[i] = NULL;
    return graph;
}

void addEdge(Graph* graph, int src, int dest) {
    Node* newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;

    newNode = createNode(src);
    newNode->next = graph->adjLists[dest];
    graph->adjLists[dest] = newNode;
}

void DFS(Graph* graph, int vertex, int visited[]) {
    visited[vertex] = 1;
    printf("%c ", 'P' + vertex); // Print the vertex (e.g., P, Q, R, ...)

    Node* adjList = graph->adjLists[vertex];
    while (adjList) {
        int neighbor = adjList->vertex;
        if (!visited[neighbor])
            DFS(graph, neighbor, visited);
        adjList = adjList->next;
    }
}

int main() {
    Graph* graph = createGraph(MAX);

    addEdge(graph, 0, 1); // P-Q
    addEdge(graph, 0, 3); // P-T
    addEdge(graph, 1, 2); // Q-R
    addEdge(graph, 1, 4); // Q-S
    addEdge(graph, 2, 5); // R-U
    addEdge(graph, 4, 2); // S-R
    addEdge(graph, 4, 5); // S-U

    printf("Depth First Traversal starting from vertex P:\n");
    int visited[MAX] = {0};
    DFS(graph, 0, visited);

    // Clean up memory (free allocated nodes and graph)
    for (int i = 0; i < MAX; ++i) {
        Node* current = graph->adjLists[i];
        while (current) {
            Node* temp = current;
            current = current->next;
            free(temp);
        }
    }
    free(graph);

    return EXIT_SUCCESS;
}