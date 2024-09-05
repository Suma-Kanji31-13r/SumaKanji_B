#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left;
    struct node *right;
} Node;

Node* createNode(int value) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation error!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

Node* insertNode(Node* root, int value) {
    if (root == NULL) {
        return createNode(value);
    }
    if (value < root->data) {
        root->left = insertNode(root->left, value);
    } else if (value > root->data) {
        root->right = insertNode(root->right, value);
    }
    return root;
}

int findDegree(Node* root, int value) {
    if (root == NULL) {
        return -1;  // Node not found
    }
    if (root->data == value) {
        int degree = 0;
        if (root->left != NULL) {
            degree++;
        }
        if (root->right != NULL) {
            degree++;
        }
        return degree;
    }
    if (value < root->data) {
        return findDegree(root->left, value);
    }
    return findDegree(root->right, value);
}

void buildTree(Node** root) {
    int nodes, value;
    printf("Enter the number of nodes in the binary tree: ");
    scanf("%d", &nodes);
    for (int i = 0; i < nodes; i++) {
        printf("Enter node %d value: ", i + 1);
        scanf("%d", &value);
        *root = insertNode(*root, value);
    }
}

int main() {
    Node* root = NULL;
    int searchValue;

    buildTree(&root);
    
    printf("Enter the node value to find its degree: ");
    scanf("%d", &searchValue);
    
    int degree = findDegree(root, searchValue);
    if (degree == -1) {
        printf("Node not found in the tree.\n");
    } else {
        printf("The degree of node with value %d is: %d\n", searchValue, degree);
    }

    return 0;
}
