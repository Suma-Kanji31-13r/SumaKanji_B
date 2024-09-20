package Exception_Handling;
import java.util.*;
class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message); } }
class CharacterCounter {
    private int count = 0;
    public void addCharacter(char character) throws NonAlphabeticCharacterException {
        if (Character.isLetter(character)) {
            count++;
            System.out.println("Total alphabetic characters so far: " + count);
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character encountered: " + character); } } }
public class running_total_of_all_character__non_alphabetic_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterCounter counter = new CharacterCounter();
        System.out.println("Enter characters one by one (type '0' to exit):");
        while (true) {
            String input = scanner.next();
            if (input.length() > 1 || input.isEmpty()) {
                System.out.println("Please enter only one character at a time.");
                continue; }
            char character = input.charAt(0);
            if (character == '0') {
                break; }
            try {
                counter.addCharacter(character);
            } catch (NonAlphabeticCharacterException e) {
                System.out.println(e.getMessage()); } }
        System.out.println("Exiting program.");
        scanner.close(); }
}
