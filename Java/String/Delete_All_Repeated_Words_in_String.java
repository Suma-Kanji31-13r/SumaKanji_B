package String;
import java.util.*;
public class Delete_All_Repeated_Words_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Split the string into words
        String[] words = inputString.split("\\s+"); // Split by one or more spaces

        // Use a LinkedHashSet to eliminate duplicates and preserve order
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Convert to lower case to handle case sensitivity
        }

        // Build the resulting string
        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            result.append(word).append(" ");
        }

        // Display the modified string
        System.out.println("String after deleting repeated words: " + result.toString().trim());
    }
}
