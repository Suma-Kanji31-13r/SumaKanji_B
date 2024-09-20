package String;
import java.util.*;
public class compareToIgnoreCase_Method_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings using the compareToIgnoreCase method
        int comparisonResult = firstString.compareToIgnoreCase(secondString);

        // Analyze and display the comparison result
        if (comparisonResult < 0) {
            System.out.println("\"" + firstString + "\" is lexicographically less than \"" + secondString + "\" (ignoring case).");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + firstString + "\" is lexicographically greater than \"" + secondString + "\" (ignoring case).");
        } else {
            System.out.println("The two strings are lexicographically equal (ignoring case).");
        }
    }
}
