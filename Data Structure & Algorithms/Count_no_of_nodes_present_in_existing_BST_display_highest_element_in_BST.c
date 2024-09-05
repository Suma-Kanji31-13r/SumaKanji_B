#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *left, *right;
} Node;

// Function to create a new BST node
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST
Node* insertNode(Node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insertNode(root->left, data);
    } else if (data > root->data) {
        root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to count the number of nodes in the BST
int countNodes(Node* root) {
    if (root == NULL) {
        return 0;
    } else {
        return 1 + countNodes(root->left) + countNodes(root->right);
    }
}

// Function to find the highest element in the BST
int findMax(Node* root) {
    if (root->right == NULL) {
        return root->data;
    } else {
        return findMax(root->right);
    }
}

// Main function to drive the program
int main() {
    Node* root = NULL;
    int n, data;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    int nodeCount = countNodes(root);
    int maxElement = findMax(root);

    printf("Number of nodes in the BST: %d\n", nodeCount);
    printf("Highest element present in the BST: %d\n", maxElement);

    return 0;
}