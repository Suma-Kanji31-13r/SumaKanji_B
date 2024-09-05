#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct Node {
    int data;
    struct Node* left, *right;
} Node;

Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

Node* insertNode(Node* root, int data) {
    if (root == NULL) return createNode(data);
    if (data < root->data) root->left = insertNode(root->left, data);
    else if (data > root->data) root->right = insertNode(root->right, data);
    return root;
}

Node* searchBST(Node* root, int key) {
    if (root == NULL || root->data == key) return root;
    if (key < root->data) return searchBST(root->left, key);
    else return searchBST(root->right, key);
}

int linearSearch(int arr[], int n, int key) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) return i;
    }
    return -1;
}

int main() {
    Node* root = NULL;
    int n, key, data;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int *arr = malloc(n * sizeof(int));
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);
        root = insertNode(root, data);
        arr[i] = data;
    }

    printf("Enter element to search: ");
    scanf("%d", &key);

    clock_t start, end;
    double cpu_time_used;

    start = clock();
    Node* found = searchBST(root, key);
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    if (found != NULL) printf("Element %d found in BST in %f seconds.\n", key, cpu_time_used);
    else printf("Element %d not found in BST.\n", key);

    start = clock();
    int index = linearSearch(arr, n, key);
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    if (index != -1) printf("Element %d found in array in %f seconds.\n", key, cpu_time_used);
    else printf("Element %d not found in array.\n", key);

    free(arr);
    return 0;
}