package Exception_Handling;
import java.util.*;
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message); } }
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message); } }
public class candidate_name_based_on_age_criteria {
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young for recruitment.");
        } else {
            System.out.println("Candidate " + name + " is eligible for recruitment."); } }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter candidate's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();
            checkEligibility(name, age);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); } }
}
