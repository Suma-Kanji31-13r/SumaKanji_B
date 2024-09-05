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
        printf("Error allocating memory!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a new node iteratively
TreeNode* insert(TreeNode *root, int value) {
    TreeNode *newNode = createNode(value);
    if (root == NULL) {
        return newNode;
    }

    TreeNode *current = root;
    TreeNode *parent = NULL;

    while (current != NULL) {
        parent = current;
        if (value < current->data) {
            current = current->left;
        } else if (value > current->data) {
            current = current->right;
        } else {
            // If the value is already present, do not insert it again
            free(newNode);
            return root;
        }
    }

    if (value < parent->data) {
        parent->left = newNode;
    } else {
        parent->right = newNode;
    }

    return root;
}

// Function to do in-order traversal of the tree
void inorderTraversal(TreeNode *root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Main function to drive the program
int main() {
    TreeNode *root = NULL;
    int n, value;

    printf("Enter the number of elements you want to add to the binary search tree: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &value);
        root = insert(root, value);
    }

    printf("In-order traversal of the binary search tree: ");
    inorderTraversal(root);
    printf("\n");

    return 0;
}
