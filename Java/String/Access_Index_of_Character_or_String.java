package String;
import java.util.*;
public class Access_Index_of_Character_or_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt for and read the character or substring to find
        System.out.print("Enter the character or substring to find its index: ");
        String toFind = scanner.nextLine();

        // Check if the input is a single character or a substring
        if (toFind.length() == 1) {
            // Single character
            char character = toFind.charAt(0);
            int index = mainString.indexOf(character);
            if (index != -1) {
                System.out.println("The first occurrence of character '" + character + "' is at index: " + index);
            } else {
                System.out.println("Character '" + character + "' is not found in the given string.");
            }
        } else {
            // Substring
            int index = mainString.indexOf(toFind);
            if (index != -1) {
                System.out.println("The first occurrence of substring \"" + toFind + "\" starts at index: " + index);
            } else {
                System.out.println("Substring \"" + toFind + "\" is not found in the given string.");
            }
        }
    }
}
