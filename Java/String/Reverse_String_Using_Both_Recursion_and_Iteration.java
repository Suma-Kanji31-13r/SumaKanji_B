package String;
import java.util.*;
public class Reverse_String_Using_Both_Recursion_and_Iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string to reverse: ");
        String input = scanner.nextLine();

        // Reverse using iteration
        String reversedByIteration = reverseIteratively(input);
        System.out.println("Reversed by iteration: " + reversedByIteration);

        // Reverse using recursion
        String reversedByRecursion = reverseRecursively(input);
        System.out.println("Reversed by recursion: " + reversedByRecursion);
    }

    // Method to reverse a string iteratively
    public static String reverseIteratively(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Method to reverse a string recursively
    public static String reverseRecursively(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
