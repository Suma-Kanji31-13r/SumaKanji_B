package String;
import java.util.*;
public class Check_whether_Given_Character_Present_String_Find_Frequency_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt for and read the character to find
        System.out.print("Enter a character to find: ");
        String inputChar = scanner.nextLine();
        if (inputChar.length() != 1) {
            System.out.println("Please enter a single character.");
            return;
        }
        char toFind = inputChar.charAt(0);

        // Initialize frequency and create a StringBuilder to hold positions
        int frequency = 0;
        StringBuilder positions = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == toFind) {
                frequency++;
                positions.append(i).append(" ");
            }
        }

        // Display the results
        if (frequency > 0) {
            System.out.println("Character '" + toFind + "' is present in the string.");
            System.out.println("Frequency: " + frequency);
            System.out.println("Positions: " + positions.toString().trim()); // Trim to remove the last extra space
        } else {
            System.out.println("Character '" + toFind + "' is not present in the string.");
        }
    }
}
