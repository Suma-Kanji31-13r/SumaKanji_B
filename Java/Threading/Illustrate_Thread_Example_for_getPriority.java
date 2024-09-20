package Threading;
import java.util.*;
public class Illustrate_Thread_Example_for_getPriority extends Thread {
    public void run() {
        System.out.println("Running thread name: " + Thread.currentThread().getName());
        System.out.println("Running thread priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Illustrate_Thread_Example_for_getPriority t1 = new Illustrate_Thread_Example_for_getPriority();
        Illustrate_Thread_Example_for_getPriority t2 = new Illustrate_Thread_Example_for_getPriority();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter priority for thread t1 (1-10): ");
        int priorityT1 = scanner.nextInt();
        System.out.println("Enter priority for thread t2 (1-10): ");
        int priorityT2 = scanner.nextInt();

        // Setting priorities based on user input
        t1.setPriority(priorityT1);
        t2.setPriority(priorityT2);

        // Start threads
        t1.start();
        t2.start();

        // Main thread
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
