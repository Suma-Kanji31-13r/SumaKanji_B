#include <stdio.h>

// Define the structure
struct Company {
    char name[50];
    char address[100];
    char phone[15];
    int noOfEmployee;
};

int main() {
    // Declare a variable of type Company
    struct Company myCompany;

    // Read company details from the user
    printf("Enter company name: ");
    scanf("%s", myCompany.name);

    printf("Enter company address: ");
    scanf("%s", myCompany.address);

    printf("Enter company phone: ");
    scanf("%s", myCompany.phone);

    printf("Enter number of employees: ");
    scanf("%d", &myCompany.noOfEmployee);

    // Display company details
    printf("\nCompany Details:\n");
    printf("Name: %s\n", myCompany.name);
    printf("Address: %s\n", myCompany.address);
    printf("Phone: %s\n", myCompany.phone);
    printf("Number of Employees: %d\n", myCompany.noOfEmployee);

    return 0;
}
