package String;
import java.util.*;
public class Display_Character_and_Corresponding_Ascii_Present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Character : ASCII");

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int ascii = (int) character; // Convert character to ASCII value

            // Display the character and its ASCII value
            System.out.println(character + " : " + ascii);
        }
    }
}
