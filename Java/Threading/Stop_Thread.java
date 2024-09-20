package Threading;
import java.util.*;

class ControlledStop implements Runnable {
    private volatile boolean exit = false;

    public void run() {
        while (!exit) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Thread is stopping...");
    }

    // Method to signal the thread to stop
    public void stop() {
        exit = true;
    }
}
public class Stop_Thread {
    public static void main(String[] args) {
        ControlledStop controlledStop = new ControlledStop();
        Thread thread = new Thread(controlledStop);
        thread.start();

        // Wait for the user to type anything then press enter to stop the thread
        System.out.println("Press enter to stop the thread.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        controlledStop.stop(); // Signal the thread to stop
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is stopping...");
    }
}
