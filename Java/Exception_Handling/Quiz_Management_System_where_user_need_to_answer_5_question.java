package Exception_Handling;
import java.util.*;
class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message); } }
public class Quiz_Management_System_where_user_need_to_answer_5_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the capital of France?",
                "What is the chemical symbol for gold?",
                "What is the capital of Japan?" };
        String[] answers = {"Paris", "Au", "Tokyo"};
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            try {
                if (!userAnswer.equalsIgnoreCase(answers[i])) {
                    throw new NotCorrectException("NotCorrectException: Wrong answer!");
                } else {
                    System.out.println("Good! The answer is correct.");
                    score++; }
            } catch (NotCorrectException e) {
                System.out.println(e.getMessage()); }
            System.out.println(); }
        System.out.println("Quiz completed. Your score: " + score + "/" + questions.length);
        scanner.close(); }
}
