package String;
import java.util.*;
public class Ask_User_His_Name_and_Greets_Him_With_His_Name {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Hello! What is your name? ");

        // Read the user's name
        String name = scanner.nextLine();

        // Greet the user with their name
        System.out.println("Nice to meet you, " + name + "!");
    }
}
