package String;
import java.util.*;
public class Make_First_Character_of_Each_Word_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Split the string into words
        String[] words = inputString.split(" ");

        // StringBuilder to build the final string
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Convert the first character to uppercase and the rest to lowercase
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                // Append the capitalized word to the final string
                capitalizedString.append(capitalizedWord).append(" ");
            }
        }

        // Trim the final string to remove any trailing space
        String result = capitalizedString.toString().trim();

        // Display the modified string
        System.out.println("String with capitalized first letter of each word: " + result);
    }
}
