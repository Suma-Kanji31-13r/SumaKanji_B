package String;
import java.util.*;
public class Search_Word_Inside_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the input sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        // Prompt for and read the word to search for
        System.out.print("Enter the word to search for: ");
        String word = scanner.nextLine();

        // Check if the sentence contains the word
        boolean isContained = sentence.contains(word);

        // Display the result
        if (isContained) {
            System.out.println("The sentence contains the word \"" + word + "\".");
        } else {
            System.out.println("The word \"" + word + "\" is not found in the sentence.");
        }
    }
}
