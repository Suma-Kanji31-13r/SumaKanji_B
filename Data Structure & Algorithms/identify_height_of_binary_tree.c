#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left;
    struct node *right;
} Node;

// Function to create a new tree node
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

// Function to insert nodes into the binary tree
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

// Function to calculate the height of the binary tree
int calculateHeight(Node* root) {
    if (root == NULL) {
        return -1;  // base case: the height of an empty tree is -1
    }
    int leftHeight = calculateHeight(root->left);
    int rightHeight = calculateHeight(root->right);
    return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
}

// Function to take input and build the tree
Node* buildTree() {
    Node* root = NULL;
    int nodes, value, i;

    printf("Enter the number of nodes in the tree: ");
    scanf("%d", &nodes);

    if (nodes > 0) {
        printf("Enter the values of the nodes:\n");
        for (i = 0; i < nodes; i++) {
            scanf("%d", &value);
            root = insertNode(root, value);
        }
    }
    return root;
}

int main() {
    Node* root = buildTree();
    int height = calculateHeight(root);
    printf("The height of the binary tree is: %d\n", height);
    return 0;
}
