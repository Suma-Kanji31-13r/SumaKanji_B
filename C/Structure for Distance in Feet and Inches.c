#include <stdio.h>

// Define the structure
struct Distance {
    int feet;
    float inches;
};

// Function to add two distances
struct Distance addDistances(struct Distance d1, struct Distance d2) {
    struct Distance result;
    result.feet = d1.feet + d2.feet;
    result.inches = d1.inches + d2.inches;
    
    // Convert excess inches to feet if necessary
    if (result.inches >= 12.0) {
        result.inches -= 12.0;
        result.feet++;
    }

    return result;
}

int main() {
    // Declare variables of type Distance
    struct Distance distance1, distance2, sum;

    // Read distances from the user
    printf("Enter the first distance:\n");
    printf("Feet: ");
    scanf("%d", &distance1.feet);
    printf("Inches: ");
    scanf("%f", &distance1.inches);

    printf("Enter the second distance:\n");
    printf("Feet: ");
    scanf("%d", &distance2.feet);
    printf("Inches: ");
    scanf("%f", &distance2.inches);

    // Add distances
    sum = addDistances(distance1, distance2);

    // Display the result
    printf("\nSum of distances: %d feet %.2f inches\n", sum.feet, sum.inches);

    return 0;
}
