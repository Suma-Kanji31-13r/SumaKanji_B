package String;
import java.util.*;
public class EqualsIgnoreCase_Method_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings using the equalsIgnoreCase method
        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("The two strings are equal, ignoring case.");
        } else {
            System.out.println("The two strings are not equal, even when ignoring case.");
        }
    }
}
