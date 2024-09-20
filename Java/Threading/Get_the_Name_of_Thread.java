package Threading;
import java.util.*;
public class Get_the_Name_of_Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to press enter
        System.out.println("Press enter to get the name of the current thread.");
        scanner.nextLine(); // Wait for user input

        // Getting and printing the name of the current thread
        String threadName = Thread.currentThread().getName();
        System.out.println("The name of the current thread is: " + threadName);
    }
}
