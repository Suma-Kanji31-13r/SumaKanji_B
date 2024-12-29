#include <stdio.h>

#define MAX_PROCESSES 5
#define MAX_RESOURCES 3

int available[MAX_RESOURCES];
int maximum[MAX_PROCESSES][MAX_RESOURCES];
int allocation[MAX_PROCESSES][MAX_RESOURCES];
int need[MAX_PROCESSES][MAX_RESOURCES];

// Function to check if a process can safely run
int canRun(int process) {
    for (int i = 0; i < MAX_RESOURCES; i++) {
        if (need[process][i] > available[i])
            return 0;
    }
    return 1;
}

// Function to check if the system is in a safe state
int isSafe() {
    int work[MAX_RESOURCES];
    int finish[MAX_PROCESSES] = {0};

    // Initialize work to available resources
    for (int i = 0; i < MAX_RESOURCES; i++)
        work[i] = available[i];

    // Check for all processes if they can finish
    for (int count = 0; count < MAX_PROCESSES; count++) {
        int foundProcess = 0;
        for (int i = 0; i < MAX_PROCESSES; i++) {
            if (finish[i] == 0 && canRun(i)) {
                // Assume this process can finish, simulate releasing its resources
                for (int j = 0; j < MAX_RESOURCES; j++)
                    work[j] += allocation[i][j];

                finish[i] = 1;
                foundProcess = 1;
                break;
            }
        }
        if (!foundProcess)
            return 0; // No process could finish, unsafe state
    }

    return 1; // Safe state
}

int main() {
    int numProcesses, numResources;

    printf("Enter the number of processes: ");
    scanf("%d", &numProcesses);

    printf("Enter the number of resources: ");
    scanf("%d", &numResources);

    printf("Enter the available resources for each type: \n");
    for (int i = 0; i < numResources; i++)
        scanf("%d", &available[i]);

    printf("Enter the maximum resources for each process: \n");
    for (int i = 0; i < numProcesses; i++) {
        printf("Process %d: ", i);
        for (int j = 0; j < numResources; j++)
            scanf("%d", &maximum[i][j]);
    }

    printf("Enter the allocated resources for each process: \n");
    for (int i = 0; i < numProcesses; i++) {
        printf("Process %d: ", i);
        for (int j = 0; j < numResources; j++)
            scanf("%d", &allocation[i][j]);
    }

    // Calculate need matrix
    for (int i = 0; i < numProcesses; i++) {
        for (int j = 0; j < numResources; j++) {
            need[i][j] = maximum[i][j] - allocation[i][j];
        }
    }

    // Check system safety
    if (isSafe()) {
        printf("The system is in a safe state.\n");
    } else {
        printf("The system is in an unsafe state. Deadlock may occur.\n");
    }

    return 0;
}
