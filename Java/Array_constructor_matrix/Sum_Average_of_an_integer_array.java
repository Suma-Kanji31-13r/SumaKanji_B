package Array_constructor_matrix;
import java.util.*;
public class Sum_Average_of_an_integer_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;

        // Read the numbers from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add current number to sum
        }

        // Calculate the average of the numbers
        double average = (double)sum / count;

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
