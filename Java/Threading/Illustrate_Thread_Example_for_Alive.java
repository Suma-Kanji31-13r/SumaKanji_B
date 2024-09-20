package Threading;
import java.util.*;
class WThread extends Thread {
    private long sleepTime;

    public WThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running and going to sleep for " + sleepTime + " milliseconds.");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }
}
public class Illustrate_Thread_Example_for_Alive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sleep time for the thread (in milliseconds): ");
        long sleepTime = scanner.nextLong();

        WThread thread = new WThread(sleepTime);

        System.out.println("Before starting the thread, is it alive? " + thread.isAlive());

        thread.start();
        System.out.println("Just after starting the thread, is it alive? " + thread.isAlive());

        // We will repeatedly check if the thread is alive.
        while (thread.isAlive()) {
            System.out.println("Waiting for the thread to finish...");
            try {
                Thread.sleep(500); // Main thread sleeps
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }

        System.out.println("After the thread has finished, is it alive? " + thread.isAlive());
    }
}
