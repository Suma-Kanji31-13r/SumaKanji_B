package String;
import java.util.*;
public class compare_To_Method_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings using the compareTo method
        int comparisonResult = firstString.compareTo(secondString);

        // Analyze the comparison result
        if (comparisonResult < 0) {
            System.out.println("\"" + firstString + "\" is lexicographically less than \"" + secondString + "\".");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + firstString + "\" is lexicographically greater than \"" + secondString + "\".");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }
    }
}
