#include <stdio.h>
#include <stdlib.h>

typedef struct TreeNode {
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
} TreeNode;

// Function to create a new node
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

// Function to insert a new node in the BST
TreeNode* insert(TreeNode *root, int value) {
    if (root == NULL) {
        return createNode(value);
    }
    if (value < root->data) {
        root->left = insert(root->left, value);
    } else if (value > root->data) {
        root->right = insert(root->right, value);
    }
    return root;
}

// Function to delete a leaf node
TreeNode* deleteLeafNode(TreeNode *root, int value) {
    if (root == NULL) {
        return root;
    }
    // Finding the node
    if (value < root->data) {
        root->left = deleteLeafNode(root->left, value);
    } else if (value > root->data) {
        root->right = deleteLeafNode(root->right, value);
    } else {
        // Check if it's a leaf node
        if (root->left == NULL && root->right == NULL) {
            free(root);
            return NULL;
        } else {
            printf("%d is not a leaf node.\n", value);
        }
    }
    return root;
}

// Function for in-order traversal of the BST
void inorderTraversal(TreeNode *root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Main function
int main() {
    TreeNode *root = NULL;
    int n, value, delValue;

    printf("Enter the number of elements to insert in the BST: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &value);
        root = insert(root, value);
    }

    printf("Enter the leaf node value to delete: ");
    scanf("%d", &delValue);

    root = deleteLeafNode(root, delValue);
    
    printf("In-order traversal after deletion: ");
    inorderTraversal(root);
    printf("\n");

    return 0;
}
