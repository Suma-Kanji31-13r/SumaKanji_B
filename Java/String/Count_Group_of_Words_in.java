package String;
import java.util.*;
public class Count_Group_of_Words_in {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().toLowerCase();

        // Prompt the user to enter words to count, separated by spaces
        System.out.println("Enter words to count, separated by spaces:");
        String[] wordsToCount = scanner.nextLine().toLowerCase().split("\\s+");

        // Use a map to count the occurrences of each word
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : wordsToCount) {
            wordCounts.put(word, 0); // Initialize the count for each word
        }

        // Split the input string into words and count the specified words
        String[] inputWords = inputString.split("\\s+");
        for (String word : inputWords) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1); // Increment the count for the word
            }
        }

        // Display the count for each specified word
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
