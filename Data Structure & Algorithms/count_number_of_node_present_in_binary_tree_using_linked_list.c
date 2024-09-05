#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left;
    struct node *right;
} Node;

// Function to create a new node
Node* createNode(int value) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Error allocating memory!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a new node in the binary search tree
Node* insertNode(Node* root, int value) {
    if (root == NULL) {
        return createNode(value);
    }
    if (value < root->data) {
        root->left = insertNode(root->left, value);
    } else if (value > root->data) {
        root->right = insertNode(root->right, value);
    }
    return root;
}

// Function to count nodes in the binary tree
int countNodes(Node* root) {
    if (root == NULL) {
        return 0;
    }
    return 1 + countNodes(root->left) + countNodes(root->right);
}

// Function to build the tree based on user input
void buildTree(Node** root) {
    int nodes, value;
    printf("Enter the number of nodes in the tree: ");
    scanf("%d", &nodes);

    for (int i = 0; i < nodes; i++) {
        printf("Enter value for node %d: ", i + 1);
        scanf("%d", &value);
        *root = insertNode(*root, value);
    }
}

int main() {
    Node* root = NULL;
    buildTree(&root);

    int nodeCount = countNodes(root);
    printf("The number of nodes in the binary tree is: %d\n", nodeCount);
    return 0;
}
