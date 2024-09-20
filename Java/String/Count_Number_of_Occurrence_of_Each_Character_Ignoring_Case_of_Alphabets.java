package String;
import java.util.*;
public class Count_Number_of_Occurrence_of_Each_Character_Ignoring_Case_of_Alphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase to ignore case

        // Use a map to count occurrences of each character
        Map<Character, Integer> occurrences = new HashMap<>();

        // Iterate through each character in the string
        for (char character : inputString.toCharArray()) {
            if (!Character.isWhitespace(character)) { // Ignore whitespace
                occurrences.put(character, occurrences.getOrDefault(character, 0) + 1);
            }
        }

        // Display the occurrences
        System.out.println("Character Occurrences (ignoring case):");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
