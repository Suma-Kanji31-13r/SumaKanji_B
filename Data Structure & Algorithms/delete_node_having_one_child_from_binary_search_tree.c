#include <stdio.h>
#include <stdlib.h>

// Structure for a node in the binary search tree.
typedef struct Node {
    int data;
    struct Node* left;
    struct Node* right;
} Node;

// Function to create a new node.
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Error creating a new node.\n");
        exit(1);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a node in the BST.
Node* insertNode(Node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insertNode(root->left, data);
    } else {
        root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to delete a node with exactly one child.
Node* deleteNodeWithOneChild(Node* root) {
    if (root == NULL) return root;

    Node* temp;
    // If the left child exists but the right child does not.
    if (root->left != NULL && root->right == NULL) {
        temp = root->left;
        free(root);
        return temp;
    }
    // If the right child exists but the left child does not.
    if (root->right != NULL && root->left == NULL) {
        temp = root->right;
        free(root);
        return temp;
    }

    // Recur for left and right subtrees.
    root->left = deleteNodeWithOneChild(root->left);
    root->right = deleteNodeWithOneChild(root->right);
    return root;
}

// Function to perform in-order traversal of the BST.
void inOrderTraversal(Node* root) {
    if (root != NULL) {
        inOrderTraversal(root->left);
        printf("%d ", root->data);
        inOrderTraversal(root->right);
    }
}

// Main function.
int main() {
    Node* root = NULL;
    int n, data;

    printf("Enter number of elements in BST: ");
    scanf("%d", &n);
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    printf("In-Order Traversal of Original Tree: ");
    inOrderTraversal(root);
    printf("\n");

    root = deleteNodeWithOneChild(root);

    printf("In-Order Traversal after Deleting Nodes with One Child: ");
    inOrderTraversal(root);
    printf("\n");

    return 0;
}
