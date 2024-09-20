package Threading;
import java.util.Scanner;
class TThread extends Thread {
    public void run() {
        // Print the name of the current thread
        System.out.println("The name of the running thread (custom thread) is: " + Thread.currentThread().getName());
    }
}
public class Get_the_Name_of_Running_Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a thread
        TThread t = new TThread();

        // Setting a name to the thread
        System.out.print("Enter a name for the custom thread: ");
        String threadName = scanner.nextLine();
        t.setName(threadName);

        // Starting the thread
        t.start();

        // Waiting for the user to press enter to continue
        System.out.println("Press enter to display the name of the main thread.");
        scanner.nextLine();

        // Getting and printing the name of the main thread
        System.out.println("The name of the main thread is: " + Thread.currentThread().getName());
    }
}
