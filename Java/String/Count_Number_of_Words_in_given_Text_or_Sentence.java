package String;
import java.util.*;
public class Count_Number_of_Words_in_given_Text_or_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text or sentence
        System.out.println("Enter a text or sentence:");
        String inputText = scanner.nextLine();

        // Count the words in the input text
        int wordCount = countWords(inputText);

        // Display the word count
        System.out.println("Number of words: " + wordCount);
    }

    /**
     * Counts the words in the given text.
     * Words are considered to be separated by one or more whitespace characters.
     *
     * @param text the text to count words in
     * @return the number of words in the text
     */
    public static int countWords(String text) {
        // Trim leading and trailing whitespace and check if the text is empty
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Split the text into words using one or more whitespace characters as the delimiter
        String[] words = text.trim().split("\\s+");

        // The number of words is the length of the array
        return words.length;
    }
}
