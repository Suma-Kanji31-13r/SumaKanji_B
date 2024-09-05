#include <stdio.h>

// Define the structure
struct Employee {
    int empId;
    char name[50];
    char address[100];
    float salary;
};

int main() {
    // Declare a variable of type Employee
    struct Employee employee;

    // Read employee details from the user
    printf("Enter employee details:\n");
    printf("Employee ID: ");
    scanf("%d", &employee.empId);

    printf("Name: ");
    scanf("%s", employee.name);

    printf("Address: ");
    scanf("%s", employee.address);

    printf("Salary: ");
    scanf("%f", &employee.salary);

    // Display employee details
    printf("\nEmployee Details:\n");
    printf("Employee ID: %d\n", employee.empId);
    printf("Name: %s\n", employee.name);
    printf("Address: %s\n", employee.address);
    printf("Salary: %.2f\n", employee.salary);

    return 0;
}
