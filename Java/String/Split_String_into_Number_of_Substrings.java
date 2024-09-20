package String;
import java.util.*;
public class Split_String_into_Number_of_Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string to split: ");
        String inputString = scanner.nextLine();

        // Prompt for and read the delimiter
        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        // Split the string based on the delimiter
        String[] substrings = inputString.split(delimiter);

        // Display the resulting substrings
        System.out.println("Resulting Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
