#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left, *right;
} Node;

// Function to create a new node
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a node in the BST
Node* insert(Node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insert(root->left, data);
    } else if (data > root->data) {
        root->right = insert(root->right, data);
    }
    return root;
}

// Function to find the inorder successor
Node* minValueNode(Node* node) {
    Node* current = node;
    // Loop down to find the leftmost leaf
    while (current && current->left != NULL) {
        current = current->left;
    }
    return current;
}

// Function to delete a node
Node* deleteNode(Node* root, int key) {
    // Base case
    if (root == NULL) return root;

    // Recursive calls for ancestors of node to be deleted
    if (key < root->data) {
        root->left = deleteNode(root->left, key);
    } else if (key > root->data) {
        root->right = deleteNode(root->right, key);
    } else {
        // Node with two children: Get the inorder successor
        if (root->left != NULL && root->right != NULL) {
            Node* temp = minValueNode(root->right);
            root->data = temp->data;
            // Delete the inorder successor
            root->right = deleteNode(root->right, temp->data);
        } else {
            // Node with one child or no child
            Node* temp = root->left ? root->left : root->right;
            // No child case
            if (temp == NULL) {
                temp = root;
                root = NULL;
            } else {
                *root = *temp; // Copy the contents
            }
            free(temp);
        }
    }
    return root;
}

// Function to do inorder traversal of the BST
void inorderTraversal(Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

int main() {
    Node* root = NULL;
    int choice, data;

    while (1) {
        printf("\n1. Insert\n2. Delete node with two children\n3. Display Inorder\n4. Exit\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter data to insert: ");
                scanf("%d", &data);
                root = insert(root, data);
                break;
            case 2:
                printf("Enter node with two children to delete: ");
                scanf("%d", &data);
                root = deleteNode(root, data);
                break;
            case 3:
                printf("Inorder Traversal: ");
                inorderTraversal(root);
                printf("\n");
                break;
            case 4:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}