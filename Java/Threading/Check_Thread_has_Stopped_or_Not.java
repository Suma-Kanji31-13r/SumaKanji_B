package Threading;
import java.util.*;
class WorkerThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started and is doing some work...");
        try {
            Thread.sleep(5000); // Simulate work by sleeping for 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Set the interrupt flag again if interrupted
            System.out.println("Thread was interrupted while sleeping.");
        }
        System.out.println("Thread work is done and is stopping now.");
    }
}
public class Check_Thread_has_Stopped_or_Not {
    public static void main(String[] args) {
        Thread thread = new Thread(new WorkerThread());
        thread.start();

        System.out.println("Press enter to check if the thread has stopped.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Wait for user input

        if (!thread.isAlive()) {
            System.out.println("The thread has stopped.");
        } else {
            System.out.println("The thread is still running.");
        }
    }
}
