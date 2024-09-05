#include <stdio.h>
#include <stdlib.h>

#define MAX_NODES 100  // Maximum number of nodes in the binary tree

int main() {
    int tree[MAX_NODES];
    int node_count = 0;  // To keep track of the number of nodes
    int value;           // Temporary variable to hold node values
    
    printf("Enter values for the binary tree level-wise (enter -1 to stop):\n");
    
    for (int i = 0; i < MAX_NODES; i++) {
        scanf("%d", &value);
        if (value == -1) {
            break;
        }
        tree[i] = value;
        node_count++;
    }

    printf("The total number of nodes in the binary tree is: %d\n", node_count);
    
    return 0;
}
