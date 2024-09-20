package String;
import java.util.*;
public class Replace_Character_or_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Character replacement
        System.out.print("Enter the character you want to replace: ");
        char oldChar = scanner.nextLine().charAt(0); // Reading only the first character

        System.out.print("Enter the new character to replace it with: ");
        char newChar = scanner.nextLine().charAt(0); // Reading only the first character

        String replacedString = originalString.replace(oldChar, newChar);
        System.out.println("String after character replacement: " + replacedString);

        // Substring replacement
        System.out.print("Enter the substring you want to replace: ");
        String target = scanner.nextLine();

        System.out.print("Enter the new substring to replace it with: ");
        String replacement = scanner.nextLine();

        String replacedSubstring = originalString.replace(target, replacement);
        System.out.println("String after substring replacement: " + replacedSubstring);
    }
}
