package String;
import java.util.*;
public class Find_First_and_Last_Occurrence_of_Given_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Prompt for and read the character to search for
        System.out.print("Enter the character to search for: ");
        String inputCharString = scanner.nextLine(); // Read the character as a string for simplicity

        // Check if the user actually entered a character
        if (inputCharString.length() != 1) {
            System.out.println("Please enter exactly one character.");
            return;
        }

        char searchChar = inputCharString.charAt(0); // Get the character from the string

        // Find the first and last occurrence of the character
        int firstOccurrence = inputString.indexOf(searchChar);
        int lastOccurrence = inputString.lastIndexOf(searchChar);

        // Display the results
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "': " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "': " + lastOccurrence);
        } else {
            System.out.println("The character '" + searchChar + "' is not found in the string.");
        }
    }
}
