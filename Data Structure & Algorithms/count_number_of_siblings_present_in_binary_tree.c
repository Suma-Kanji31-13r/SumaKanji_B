#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *left;
    struct node *right;
} Node;

Node* createNode(int value) {
    Node *newNode = (Node*) malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Error allocating memory!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

Node* insertNode(Node *root, int value) {
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

// Helper function to find node and its parent
int findNodeAndParent(Node *root, int value, Node** parent) {
    Node *current = root;
    *parent = NULL;

    while (current != NULL) {
        if (value == current->data) {
            return 1; // Node found
        }
        *parent = current;
        if (value < current->data) {
            current = current->left;
        } else {
            current = current->right;
        }
    }
    return 0; // Node not found
}

int countSiblings(Node* root, int value) {
    Node *parent = NULL;
    if (!findNodeAndParent(root, value, &parent)) {
        return -1; // Node not found
    }
    if (parent == NULL) {
        return -2; // Node is root
    }
    if (parent->left && parent->right) {
        return 1; // Two children, hence one sibling
    }
    return 0; // No sibling
}

void buildTree(Node** root) {
    int nodes, value;
    printf("Enter the number of nodes in the tree: ");
    scanf("%d", &nodes);

    for (int i = 0; i < nodes; i++) {
        printf("Enter value for node %d: ", i + 1);
        scanf("%d", &value);
        *root = insertNode(*root, value);
    }
}

int main() {
    Node* root = NULL;
    buildTree(&root);

    int target;
    printf("Enter the value of the node to find its siblings: ");
    scanf("%d", &target);

    int result = countSiblings(root, target);
    if (result == -1) {
        printf("Node %d not found in the tree.\n", target);
    } else if (result == -2) {
        printf("Node %d is the root node and has no siblings.\n", target);
    } else {
        printf("The number of siblings of node %d is: %d\n", target, result);
    }

    return 0;
}
