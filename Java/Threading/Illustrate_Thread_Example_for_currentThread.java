package Threading;
import java.util.*;
public class Illustrate_Thread_Example_for_currentThread implements Runnable{
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " has been interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished counting down.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number to count down from (The main thread will count down from 5):");
            int number = scanner.nextInt();

            Illustrate_Thread_Example_for_currentThread myRunnable = new Illustrate_Thread_Example_for_currentThread();
            Thread myThread = new Thread(myRunnable, "My Countdown Thread");

            // Start the separate thread
            myThread.start();

            // Also perform countdown on the main thread
            for (int i = number; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    // Sleep for 1 second
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " has been interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " has finished counting down.");

            // Wait for the other thread to finish
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
