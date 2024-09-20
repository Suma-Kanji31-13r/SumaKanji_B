package String;
import java.util.*;
public class Remove_all_Characters_in_Second_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the first and second strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Remove all characters from the second string that are present in the first string
        String resultString = removeChars(firstString, secondString);

        // Display the result
        System.out.println("Second string after removal: " + resultString);
    }

    // Method to remove all characters from secondString that are present in firstString
    public static String removeChars(String firstString, String secondString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < secondString.length(); i++) {
            char currentChar = secondString.charAt(i);
            // If the current character is not found in the first string, append it to the result
            if (firstString.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
