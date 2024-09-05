#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* left, *right;
} Node;

// Function to create a new node
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST
Node* insertNode(Node* node, int data) {
    if (node == NULL) {
        return createNode(data);
    }
    if (data < node->data) {
        node->left = insertNode(node->left, data);
    } else if (data > node->data) {
        node->right = insertNode(node->right, data);
    }
    return node;
}

// Function to perform in-order traversal of the BST
void inorderTraversal(Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Main function to drive the program
int main() {
    Node* root = NULL;
    int n, data;

    printf("Enter the number of initial elements: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    printf("Enter an additional element to insert: ");
    scanf("%d", &data);
    root = insertNode(root, data);

    printf("In-order traversal of the BST after insertion: ");
    inorderTraversal(root);
    printf("\n");

    return 0;
}