package Exception_Handling;
import java.util.*;
class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message); } }
public class display_series_of_five_student_ID_numbers_enter_numeric_test_score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentIDs = {101, 102, 103, 104, 105};
        int[] scores = new int[studentIDs.length];
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("Enter score for student ID " + studentIDs[i] + ": ");
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score. Scores must be between 0 and 100."); }
                scores[i] = score; // Store valid score
            } catch (ScoreException e) {
                System.out.println(e.getMessage() + " Setting score to 0.");
                scores[i] = 0; } }
        System.out.println("\nAll Student Scores:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Score: " + scores[i]); }
        scanner.close(); }
}
