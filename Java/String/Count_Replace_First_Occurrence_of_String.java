package String;
import java.util.*;
public class Count_Replace_First_Occurrence_of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt for and read the substring to find
        System.out.print("Enter the substring to find: ");
        String toFind = scanner.nextLine();

        // Prompt for and read the replacement string
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        // Count the total occurrences of the substring
        int occurrences = countOccurrences(mainString, toFind);

        // Replace the first occurrence of the substring
        String replacedString = mainString.replaceFirst(toFind, replacement);

        // Display the results
        System.out.println("New string: " + replacedString);
        System.out.println("Total occurrences of '" + toFind + "' before replacement: " + occurrences);
    }

    // Method to count occurrences of a substring in a string
    private static int countOccurrences(String str, String subStr) {
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = str.indexOf(subStr, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }

        return count;
    }
}
