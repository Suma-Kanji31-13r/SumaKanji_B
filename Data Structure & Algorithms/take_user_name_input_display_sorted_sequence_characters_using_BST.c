#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node {
    char data;
    struct Node *left, *right;
} Node;

// Function to create a new BST node
Node* createNode(char data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a new character into the BST
Node* insertNode(Node* node, char data) {
    if (node == NULL) return createNode(data);

    if (data < node->data)
        node->left = insertNode(node->left, data);
    else if (data > node->data)
        node->right = insertNode(node->right, data);

    return node;
}

// Function to perform in-order traversal of the BST
void inorderTraversal(Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%c", root->data);
        inorderTraversal(root->right);
    }
}

// Main function to drive the program
int main() {
    Node* root = NULL;
    char name[100];

    printf("Enter your name: ");
    scanf("%99s", name); // Reading the input name from the user

    // Insert each character of the name into the BST
    for (int i = 0; i < strlen(name); i++) {
        root = insertNode(root, name[i]);
    }

    // Display the characters of the name in sorted order
    printf("Sorted sequence of characters: ");
    inorderTraversal(root);
    printf("\n");

    return 0;
}