package String;
import java.util.*;
public class Accept_2_String_Check_Whether_all_Characters_First_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt for and read the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if all characters in the first string are present in the second string
        boolean allCharactersPresent = areAllCharactersPresent(firstString, secondString);

        // Print the result
        if (allCharactersPresent) {
            System.out.println("All characters in the first string are present in the second string.");
        } else {
            System.out.println("Not all characters in the first string are present in the second string.");
        }
    }

    private static boolean areAllCharactersPresent(String first, String second) {
        for (char character : first.toCharArray()) {
            if (second.indexOf(character) == -1) {
                return false; // Character not found in the second string
            }
        }
        return true; // All characters found
    }
}
