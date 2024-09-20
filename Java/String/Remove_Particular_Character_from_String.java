package String;
import java.util.*;
public class Remove_Particular_Character_from_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Prompt for and read the character to be removed
        System.out.print("Enter the character you want to remove: ");
        char charToRemove = scanner.nextLine().charAt(0); // Reading only the first character

        // Remove the character from the string
        String modifiedString = originalString.replace(String.valueOf(charToRemove), "");

        // Display the modified string
        System.out.println("String after removing '" + charToRemove + "': " + modifiedString);
    }
}
