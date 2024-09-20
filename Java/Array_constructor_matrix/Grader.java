package Array_constructor_matrix;
import java.util.*;
public class Grader {
    private double score;

    // Constructor to initialize the score
    public Grader(double score) {
        this.score = score;
    }

    // Method to determine the letter grade
    public String letterGrade() {
        if (score >= 90) {
            return "O"; // Outstanding
        } else if (score >= 80) {
            return "E"; // Excellent
        } else if (score >= 70) {
            return "A"; // Good
        } else if (score >= 60) {
            return "B"; // Average
        } else if (score >= 50) {
            return "C"; // Below Average
        } else {
            return "F"; // Fail
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        double score = scanner.nextDouble();

        // Validate the input
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. The score must be between 0 and 100.");
        } else {
            // Create a Grader object and print the grade
            Grader grader = new Grader(score);
            System.out.println("The letter grade is: " + grader.letterGrade());
        }
    }
}
