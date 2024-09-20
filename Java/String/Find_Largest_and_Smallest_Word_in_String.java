package String;
import java.util.*;
public class Find_Largest_and_Smallest_Word_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Split the input string into words
        String[] words = inputString.split("\\s+"); // Split based on one or more spaces

        // Initialize largest and smallest words
        String largestWord = "";
        String smallestWord = "";

        if (words.length > 0) {
            // Assume the first word is both the largest and smallest initially
            largestWord = smallestWord = words[0];

            // Iterate over the words to find the largest and smallest
            for (String word : words) {
                if (word.length() > largestWord.length()) {
                    largestWord = word;
                }
                if (word.length() < smallestWord.length()) {
                    smallestWord = word;
                }
            }
        }

        // Display the results
        System.out.println("Largest word: " + largestWord);
        System.out.println("Smallest word: " + smallestWord);
    }
}
