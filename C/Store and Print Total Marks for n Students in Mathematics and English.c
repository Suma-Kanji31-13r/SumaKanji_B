#include <stdio.h>

int main() {
    int n;

    // Get the number of students from the user
    printf("Enter the number of students: ");
    scanf("%d", &n);

    // Declare arrays to store marks in Mathematics and English
    int mathMarks[n];
    int engMarks[n];
    int totalMarks[n];

    // Input marks for each student in Mathematics and English
    for (int i = 0; i < n; i++) {
        printf("Enter Mathematics marks for student %d: ", i + 1);
        scanf("%d", &mathMarks[i]);

        printf("Enter English marks for student %d: ", i + 1);
        scanf("%d", &engMarks[i]);

        // Calculate total marks for each student
        totalMarks[i] = mathMarks[i] + engMarks[i];
    }

    // Display total marks for each student
    printf("\nTotal Marks for students:\n");
    for (int i = 0; i < n; i++) {
        printf("Student %d: %d\n", i + 1, totalMarks[i]);
    }

    return 0;
}
