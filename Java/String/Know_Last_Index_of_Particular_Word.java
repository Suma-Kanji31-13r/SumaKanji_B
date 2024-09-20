package String;
import java.util.*;
public class Know_Last_Index_of_Particular_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt for and read the word to find
        System.out.print("Enter the word to find its last index: ");
        String word = scanner.nextLine();

        // Find the last index of the word
        // Note: To find the actual starting index of the last occurrence of the word,
        // we search for the last occurrence of the word and add the length of the word minus 1 to its starting index.
        int lastIndex = mainString.lastIndexOf(word);

        if (lastIndex != -1) {
            System.out.println("The last occurrence of \"" + word + "\" starts at index: " + lastIndex);
        } else {
            System.out.println("The word \"" + word + "\" is not found in the given string.");
        }
    }
}
