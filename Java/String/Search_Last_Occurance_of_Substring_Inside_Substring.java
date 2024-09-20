package String;
import java.util.*;
public class Search_Last_Occurance_of_Substring_Inside_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt for and read the substring to find
        System.out.print("Enter the substring to search for: ");
        String searchString = scanner.nextLine();

        // Search for the last occurrence of the substring
        int lastIndex = mainString.lastIndexOf(searchString);

        // Check if the substring was found
        if (lastIndex != -1) {
            System.out.println("The last occurrence of the substring \"" + searchString +
                    "\" is at index " + lastIndex + ".");
        } else {
            System.out.println("The substring \"" + searchString + "\" is not found.");
        }
    }
}
