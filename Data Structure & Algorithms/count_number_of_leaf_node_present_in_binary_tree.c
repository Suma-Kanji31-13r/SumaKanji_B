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

int countLeafNodes(Node* root) {
    if (root == NULL) {
        return 0;
    }
    if (root->left == NULL && root->right == NULL) {
        return 1;  // This is a leaf node
    }
    return countLeafNodes(root->left) + countLeafNodes(root->right);
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
    buildTree(&root);

    int leafCount = countLeafNodes(root);
    printf("The number of leaf nodes in the binary tree is: %d\n", leafCount);
    return 0;
}
