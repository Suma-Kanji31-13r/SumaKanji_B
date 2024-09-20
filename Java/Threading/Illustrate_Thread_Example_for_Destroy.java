package Threading;
import java.util.*;
public class Illustrate_Thread_Example_for_Destroy implements Runnable {
    // Volatile boolean flag to control the execution of the thread
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Thread has been stopped safely.");
    }

    // Method to safely stop the thread
    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) {
        Illustrate_Thread_Example_for_Destroy example = new Illustrate_Thread_Example_for_Destroy();
        Thread thread = new Thread(example);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type 'start' to run the thread:");
            String command = scanner.nextLine();

            if ("start".equalsIgnoreCase(command)) {
                thread.start();
            } else {
                System.out.println("Unknown command. Exiting...");
                return;
            }

            System.out.println("Type 'stop' to stop the thread:");
            command = scanner.nextLine();

            if ("stop".equalsIgnoreCase(command)) {
                example.stopRunning();
                thread.join(); // Wait for the thread to finish
            } else {
                System.out.println("Unknown command. Exiting...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
