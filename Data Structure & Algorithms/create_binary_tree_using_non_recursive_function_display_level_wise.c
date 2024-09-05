#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left;
    struct node *right;
} Node;

// Queue for tree node pointers
typedef struct queue {
    Node** items;
    int front;
    int rear;
    int capacity;
} Queue;

Queue* createQueue(int capacity) {
    Queue* q = (Queue*) malloc(sizeof(Queue));
    q->items = (Node**) malloc(sizeof(Node*) * capacity);
    q->front = 0;
    q->rear = -1;
    q->capacity = capacity;
    return q;
}

int isFull(Queue* q) {
    return q->rear == q->capacity - 1;
}

int isEmpty(Queue* q) {
    return q->front > q->rear;
}

void enqueue(Queue* q, Node* node) {
    if (isFull(q)) {
        printf("Queue is full!\n");
        return;
    }
    q->items[++q->rear] = node;
}

Node* dequeue(Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return NULL;
    }
    return q->items[q->front++];
}

Node* createNewNode(int value) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert nodes into the binary tree using an iterative approach
Node* insert(Node* root, int value) {
    Node* newNode = createNewNode(value);
    if (root == NULL) {
        root = newNode;
        return root;
    }

    Queue* queue = createQueue(100); // Arbitrary queue size
    enqueue(queue, root);

    while (!isEmpty(queue)) {
        Node* temp = dequeue(queue);
        
        // Insert in the left subtree if space is available
        if (temp->left == NULL) {
            temp->left = newNode;
            break;
        } else {
            enqueue(queue, temp->left);
        }
        
        // Insert in the right subtree if space is available
        if (temp->right == NULL) {
            temp->right = newNode;
            break;
        } else {
            enqueue(queue, temp->right);
        }
    }

    free(queue->items);
    free(queue);
    return root;
}

// Function to print level order traversal of the tree
void printLevelOrder(Node* root) {
    if (root == NULL) return;

    Queue* queue = createQueue(100); // Arbitrary queue size
    enqueue(queue, root);

    while (!isEmpty(queue)) {
        Node* temp = dequeue(queue);
        printf("%d ", temp->data);

        if (temp->left != NULL)
            enqueue(queue, temp->left);
        if (temp->right != NULL)
            enqueue(queue, temp->right);
    }
    printf("\n");

    free(queue->items);
    free(queue);
}

int main() {
    Node* root = NULL;
    int data, nodes, i;

    printf("Enter the number of nodes: ");
    scanf("%d", &nodes);

    printf("Enter node values:\n");
    for (i = 0; i < nodes; i++) {
        scanf("%d", &data);
        root = insert(root, data);
    }

    printf("Level order traversal of the binary tree is:\n");
    printLevelOrder(root);

    return 0;
}
