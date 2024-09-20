package String;
import java.util.*;
public class Access_Characters_or_ASCII_of_Character_Available {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int asciiValue = (int) character; // Casting the character to an int will give its ASCII value

            // Display the character and its ASCII value
            System.out.println("Character: " + character + ", ASCII Value: " + asciiValue);
        }
    }
}
