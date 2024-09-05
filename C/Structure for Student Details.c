#include <stdio.h>

// Define the structure
struct Student {
    int rollNo;
    char name[50];
    char address[100];
    int age;
    float averageMarks;
};

// Function to display student details
void displayStudent(struct Student s) {
    printf("Roll No: %d\n", s.rollNo);
    printf("Name: %s\n", s.name);
    printf("Address: %s\n", s.address);
    printf("Age: %d\n", s.age);
    printf("Average Marks: %.2f\n", s.averageMarks);
    printf("\n");
}

int main() {
    // Declare an array of type Student to store details of 12 students
    struct Student students[12];

    // Read student details from the user
    for (int i = 0; i < 12; i++) {
        printf("Enter details for Student %d:\n", i + 1);
        printf("Roll No: ");
        scanf("%d", &students[i].rollNo);

        printf("Name: ");
        scanf("%s", students[i].name);

        printf("Address: ");
        scanf("%s", students[i].address);

        printf("Age: ");
        scanf("%d", &students[i].age);

        printf("Average Marks: ");
        scanf("%f", &students[i].averageMarks);
    }

    // Display student details using the displayStudent function
    for (int i = 0; i < 12; i++) {
        displayStudent(students[i]);
    }

    return 0;
}
