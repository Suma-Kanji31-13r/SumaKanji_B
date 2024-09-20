package String;
import java.util.*;
public class Sort_String_Ignoring_Whitespaces_and_Repeating_Characters_Only_Once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Remove whitespaces
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");

        // Use a TreeSet to remove duplicates and sort the characters
        Set<Character> charSet = new TreeSet<>();
        for (char c : stringWithoutSpaces.toCharArray()) {
            charSet.add(c);
        }

        // Build the sorted string with unique characters
        StringBuilder sortedUniqueCharsString = new StringBuilder();
        for (char c : charSet) {
            sortedUniqueCharsString.append(c);
        }

        // Display the result
        System.out.println("Sorted string with unique characters (ignoring whitespaces): " + sortedUniqueCharsString);
    }
}
