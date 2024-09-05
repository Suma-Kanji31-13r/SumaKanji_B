#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* left;
    struct node* right;
} Node;

// Function to create a new node
Node* createNewNode(int value) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    if (newNode == NULL) {
        fprintf(stderr, "Out of memory!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert into the binary tree recursively
Node* insert(Node* root, int value) {
    if (root == NULL) { // Base case: empty tree
        root = createNewNode(value);
    } else if (value < root->data) { // Insert in the left subtree
        root->left = insert(root->left, value);
    } else { // Insert in the right subtree
        root->right = insert(root->right, value);
    }
    return root;
}

// Function to print level order traversal of the tree
void printLevelOrder(Node* root) {
    if (root == NULL) return;

    int rear = 0, front = 0;
    Node* queue[100]; // Simple fixed size queue for demonstration
    Node* tempNode;

    queue[rear++] = root;

    while (front < rear) {
        tempNode = queue[front++];
        printf("%d ", tempNode->data);

        if (tempNode->left != NULL)
            queue[rear++] = tempNode->left;
        if (tempNode->right != NULL)
            queue[rear++] = tempNode->right;
    }
    printf("\n");
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
