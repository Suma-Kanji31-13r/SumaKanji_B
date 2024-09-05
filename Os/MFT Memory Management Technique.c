#include <stdio.h>

// Function definition for MFT
void MFT() {
    int totalMemory, blockSize, numberOfBlocks, numberOfProcesses;
    int memoryRequired[10], allocated[10], internalFragmentation = 0;
    
    printf("Enter the total memory available (in Bytes) -- ");
    scanf("%d", &totalMemory);
    printf("Enter the block size (in Bytes) -- ");
    scanf("%d", &blockSize);
    printf("Enter the number of processes -- ");
    scanf("%d", &numberOfProcesses);
    
    numberOfBlocks = totalMemory / blockSize;

    for (int i = 0; i < numberOfProcesses; i++) {
        printf("Enter memory required for process %d (in Bytes) -- ", i + 1);
        scanf("%d", &memoryRequired[i]);
    }

    printf("\nPROCESS\tMEMORY REQUIRED\tALLOCATED\tINTERNAL FRAGMENTATION\n");
    for (int i = 0; i < numberOfProcesses; i++) {
        if (memoryRequired[i] <= blockSize && numberOfBlocks > 0) {
            allocated[i] = 1;
            internalFragmentation += (blockSize - memoryRequired[i]);
            printf("%d\t\t%d\t\tYES\t\t%d\n", i + 1, memoryRequired[i], blockSize - memoryRequired[i]);
            numberOfBlocks--;
        } else {
            allocated[i] = 0;
            printf("%d\t\t%d\t\tNO\t\t-\n", i + 1, memoryRequired[i]);
        }
    }
    
    int externalFragmentation = totalMemory - (blockSize * (totalMemory / blockSize));
    
    printf("\nTotal Internal Fragmentation is %d\n", internalFragmentation);
    printf("Total External Fragmentation is %d\n", externalFragmentation);
}

// Function definition for MVT
void MVT() {
    int totalMemory, memoryAllocated = 0, memoryRequired;
    char choice;
    
    printf("Enter the total memory available (in Bytes) -- ");
    scanf("%d", &totalMemory);

    while (1) {
        printf("Enter memory required for process (in Bytes) -- ");
        scanf("%d", &memoryRequired);
        
        if (memoryRequired <= (totalMemory - memoryAllocated)) {
            memoryAllocated += memoryRequired;
            printf("Memory is allocated for Process\n");
        } else {
            printf("Memory is Full\n");
            break;
        }
        
        printf("Do you want to continue(y/n) -- ");
        scanf(" %c", &choice);
        
        if (choice == 'n' || choice == 'N') {
            break;
        }
    }
    
    int externalFragmentation = totalMemory - memoryAllocated;
    
    printf("\nTotal Memory Available -- %d\n", totalMemory);
    printf("Total Memory Allocated is %d\n", memoryAllocated);
    printf("Total External Fragmentation is %d\n", externalFragmentation);
}

int main() {
    int choice;
    printf("Choose Memory Management Technique: 1. MFT  2. MVT\n");
    scanf("%d", &choice);
    
    if (choice == 1) {
        MFT();
    } else if (choice == 2) {
        MVT();
    } else {
        printf("Invalid choice!");
    }

    return 0;
}
