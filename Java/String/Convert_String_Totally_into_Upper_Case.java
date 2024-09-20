package String;
import java.util.*;
public class Convert_String_Totally_into_Upper_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string to convert to uppercase: ");
        String inputString = scanner.nextLine();

        // Convert the string to uppercase
        String upperCaseString = inputString.toUpperCase();

        // Display the uppercase string
        System.out.println("String in uppercase: " + upperCaseString);
    }
}
