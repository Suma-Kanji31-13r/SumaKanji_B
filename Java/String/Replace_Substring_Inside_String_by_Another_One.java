package String;
import java.util.*;
public class Replace_Substring_Inside_String_by_Another_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Prompt for and read the substring to be replaced
        System.out.print("Enter the substring you want to replace: ");
        String substringToReplace = scanner.nextLine();

        // Prompt for and read the new substring
        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Replace the substring in the original string
        String modifiedString = originalString.replace(substringToReplace, newSubstring);

        // Display the modified string
        System.out.println("Modified string: " + modifiedString);
    }
}
