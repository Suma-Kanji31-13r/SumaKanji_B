#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

typedef struct Graph {
    int numVertices;
    Node** adjLists;
    int* visited;
    int* recStack; // Stack to keep track of vertices in the current recursion stack
} Graph;

Node* createNode(int v) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

Graph* createGraph(int vertices) {
    Graph* graph = (Graph*)malloc(sizeof(Graph));
    graph->numVertices = vertices;
    graph->adjLists = (Node**)malloc(vertices * sizeof(Node*));
    graph->visited = (int*)malloc(vertices * sizeof(int));
    graph->recStack = (int*)malloc(vertices * sizeof(int));

    int i;
    for (i = 0; i < vertices; i++) {
        graph->adjLists[i] = NULL;
        graph->visited[i] = 0;
        graph->recStack[i] = 0;
    }
    return graph;
}

void addEdge(Graph* graph, int src, int dest) {
    Node* newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;
}

int isCyclicUtil(int v, Graph* graph) {
    if (graph->visited[v] == 0) {
        graph->visited[v] = 1;
        graph->recStack[v] = 1;

        Node* temp = graph->adjLists[v];
        while (temp != NULL) {
            int connectedVertex = temp->vertex;
            if (!graph->visited[connectedVertex] && isCyclicUtil(connectedVertex, graph))
                return 1;
            else if (graph->recStack[connectedVertex])
                return 1;
            temp = temp->next;
        }
    }
    graph->recStack[v] = 0;  // remove the vertex from recursion stack
    return 0;
}

int isCyclic(Graph* graph) {
    int i;
    for (i = 0; i < graph->numVertices; i++)
        if (isCyclicUtil(i, graph))
            return 1;

    return 0;
}

int main() {
    int vertices, edges, i, src, dest;
    printf("Enter number of vertices: ");
    scanf("%d", &vertices);
    printf("Enter number of edges: ");
    scanf("%d", &edges);

    Graph* graph = createGraph(vertices);

    printf("Enter edges in format <source> <destination>:\n");
    for (i = 0; i < edges; i++) {
        scanf("%d %d", &src, &dest);
        addEdge(graph, src, dest);
    }

    if (isCyclic(graph))
        printf("Graph contains a cycle\n");
    else
        printf("Graph does not contain a cycle\n");

    return 0;
}
