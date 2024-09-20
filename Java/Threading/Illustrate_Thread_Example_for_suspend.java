package Threading;
import java.util.*;
public class Illustrate_Thread_Example_for_suspend implements Runnable{
    private Thread th;
    private boolean suspended = false;

    public Illustrate_Thread_Example_for_suspend(String threadName) {
        th = new Thread(this, threadName);
        System.out.println("New thread: " + th);
        th.start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 15; i > 0; i--) {
                System.out.println(th.getName() + ": " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(th.getName() + " interrupted.");
        }
        System.out.println(th.getName() + " exiting.");
    }

    // Pause the thread
    synchronized void suspend() {
        suspended = true;
    }

    // Resume the thread
    synchronized void resume() {
        suspended = false;
        notify();
    }

    public static void main(String args[]) {
        Illustrate_Thread_Example_for_suspend example = new Illustrate_Thread_Example_for_suspend("My Thread");

        try (Scanner scanner = new Scanner(System.in)) {
            // Give the user control to suspend and resume the thread.
            while (true) {
                System.out.println("Type 'suspend' to suspend the thread, 'resume' to resume it, or 'exit' to stop:");
                String command = scanner.nextLine();

                switch (command.toLowerCase()) {
                    case "suspend":
                        example.suspend();
                        break;
                    case "resume":
                        example.resume();
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
        }
    }
}
