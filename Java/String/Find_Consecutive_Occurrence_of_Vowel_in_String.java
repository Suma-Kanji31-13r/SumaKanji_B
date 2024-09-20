package String;
import java.util.*;
public class Find_Consecutive_Occurrence_of_Vowel_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase to make the search case-insensitive

        // Call the method to find and display the count of consecutive vowels
        int count = findConsecutiveVowels(inputString);
        System.out.println("The count of consecutive vowels is: " + count);
    }

    // Method to find consecutive vowels in the string
    public static int findConsecutiveVowels(String str) {
        int count = 0; // Initialize count of consecutive vowels
        for (int i = 0; i < str.length() - 1; i++) { // Loop to second-last character
            if (isVowel(str.charAt(i)) && isVowel(str.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    // Utility method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
