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
    if (!newNode) {
        fprintf(stderr, "Error allocating memory.\n");
        exit(EXIT_FAILURE);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST.
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

// Function to find the minimum value node in the BST.
Node* minNode(Node* node) {
    Node* current = node;
    while (current && current->left != NULL) {
        current = current->left;
    }
    return current;
}

// Function to delete a node from the BST.
Node* deleteNode(Node* root, int data) {
    if (root == NULL) return root;

    // If the data to be deleted is smaller than the root's data,
    // it lies in the left subtree.
    if (data < root->data) {
        root->left = deleteNode(root->left, data);
    }
    // If the data to be deleted is greater than the root's data,
    // it lies in the right subtree.
    else if (data > root->data) {
        root->right = deleteNode(root->right, data);
    }
    // if data is the same as root's data, then this is the node to be deleted.
    else {
        // Node with only one child or no child.
        if (root->left == NULL) {
            Node* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            Node* temp = root->left;
            free(root);
            return temp;
        }

        // Node with two children: Get the inorder successor (smallest in the right subtree).
        Node* temp = minNode(root->right);

        // Copy the inorder successor's content to this node.
        root->data = temp->data;

        // Delete the inorder successor.
        root->right = deleteNode(root->right, temp->data);
    }
    return root;
}

// Function to do an inorder traversal of the BST.
void inorderTraversal(Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Main function to drive the program.
int main() {
    Node* root = NULL;
    int n, data, delData;

    printf("Enter number of elements in BST: ");
    scanf("%d", &n);
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    printf("In-order traversal of the original tree:\n");
    inorderTraversal(root);
    printf("\n");

    printf("Enter the node data to delete: ");
    scanf("%d", &delData);
    root = deleteNode(root, delData);

    printf("In-order traversal after deletion:\n");
    inorderTraversal(root);
    printf("\n");

    return 0;
}
