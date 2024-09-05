#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* left, *right;
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
    if (root == NULL) return createNode(data);

    if (data < root->data)
        root->left = insertNode(root->left, data);
    else if (data > root->data)
        root->right = insertNode(root->right, data);

    return root;
}

// Function to search for an element in the BST
Node* searchBST(Node* root, int data) {
    if (root == NULL || root->data == data) 
        return root;

    if (data < root->data)
        return searchBST(root->left, data);
    else
        return searchBST(root->right, data);
}

// Main function to drive the program
int main() {
    Node* root = NULL;
    int n, data, searchValue;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    printf("Enter the value to search for: ");
    scanf("%d", &searchValue);

    Node* result = searchBST(root, searchValue);
    if (result != NULL)
        printf("Element %d found in the BST.\n", searchValue);
    else
        printf("Element %d not found in the BST.\n", searchValue);

    return 0;
}