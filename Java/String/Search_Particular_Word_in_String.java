package String;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Search_Particular_Word_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Prompt for and read the word to search for
        System.out.print("Enter the word to search for: ");
        String word = scanner.nextLine();

        // Prepare a regex pattern to search for the word with word boundaries
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(inputString);

        // Check if the word is found
        boolean found = matcher.find();

        // Display the result
        if (found) {
            System.out.println("The word \"" + word + "\" is found in the string.");
        } else {
            System.out.println("The word \"" + word + "\" is not found in the string.");
        }
    }
}
