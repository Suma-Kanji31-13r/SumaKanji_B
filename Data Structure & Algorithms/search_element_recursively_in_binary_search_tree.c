#include <stdio.h>
#include <stdlib.h>

// Define the structure for the tree node
typedef struct TreeNode {
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
} TreeNode;

// Function to create a new tree node
TreeNode* createNode(int value) {
    TreeNode *newNode = (TreeNode *)malloc(sizeof(TreeNode));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a new node recursively
TreeNode* insert(TreeNode *root, int value) {
    if (root == NULL) {
        root = createNode(value);
    } else if (value < root->data) {
        root->left = insert(root->left, value);
    } else if (value > root->data) {
        root->right = insert(root->right, value);
    }
    return root;
}

// Recursive function to search for a value in the tree
TreeNode* search(TreeNode *root, int value) {
    if (root == NULL || root->data == value) {
        return root;
    }
    if (value < root->data) {
        return search(root->left, value);
    }
    return search(root->right, value);
}

// Main function to drive the program
int main() {
    TreeNode *root = NULL;
    int n, value, searchValue;

    printf("Enter the number of elements to insert in the binary search tree: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &value);
        root = insert(root, value);
    }

    printf("Enter the value to search in the binary search tree: ");
    scanf("%d", &searchValue);
    
    TreeNode *found = search(root, searchValue);
    if (found != NULL) {
        printf("Value %d found in the binary search tree.\n", searchValue);
    } else {
        printf("Value %d not found in the binary search tree.\n", searchValue);
    }

    return 0;
}
