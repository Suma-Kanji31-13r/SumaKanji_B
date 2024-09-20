package String;
import java.util.*;
public class Give_Shortest_Sequence_of_Character_Insertions_and_Deletions_Turn_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        printEditSequence(str1, str2);
    }

    private static void printEditSequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int[][] dp = new int[m+1][n+1];

        // Fill dp array
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0) {
                    dp[i][j] = j; // Min. operations = j (all insertions)
                } else if(j == 0) {
                    dp[i][j] = i; // Min. operations = i (all deletions)
                } else if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], // Deletion
                            dp[i][j-1]); // Insertion
                }
            }
        }

        // Trace the sequence of operations
        int i = m, j = n;
        StringBuilder sequence = new StringBuilder();
        while(i > 0 && j > 0) {
            if(str1.charAt(i-1) == str2.charAt(j-1)) {
                i--;
                j--;
            } else if(dp[i-1][j] < dp[i][j-1]) { // Deletion is cheaper
                sequence.insert(0, "Delete '" + str1.charAt(i-1) + "' from position " + i + "\n");
                i--;
            } else { // Insertion is cheaper or equal
                sequence.insert(0, "Insert '" + str2.charAt(j-1) + "' at position " + i + "\n");
                j--;
            }
        }

        // If any insertions are left
        while(j > 0) {
            sequence.insert(0, "Insert '" + str2.charAt(j-1) + "' at position 0\n");
            j--;
        }

        // If any deletions are left
        while(i > 0) {
            sequence.insert(0, "Delete '" + str1.charAt(i-1) + "' from position " + i + "\n");
            i--;
        }

        System.out.println("Edit sequence to turn \"" + str1 + "\" into \"" + str2 + "\":\n" + sequence);
    }
}
