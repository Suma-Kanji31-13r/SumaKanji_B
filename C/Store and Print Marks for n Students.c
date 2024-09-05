#include <stdio.h>

int main() {
    int n;

    // Get the number of students from the user
    printf("Enter the number of students: ");
    scanf("%d", &n);

    // Declare an array to store marks
    int marks[n];

    // Input marks for each student
    for (int i = 0; i < n; i++) {
        printf("Enter marks for student %d: ", i + 1);
        scanf("%d", &marks[i]);
    }

    // Display marks for each student
    printf("\nMarks for students:\n");
    for (int i = 0; i < n; i++) {
        printf("Student %d: %d\n", i + 1, marks[i]);
    }

    return 0;
}
