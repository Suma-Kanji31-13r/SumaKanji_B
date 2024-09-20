package Threading;
import java.util.*;
class MessagePrinter implements Runnable {
    private String message;
    private int times;

    public MessagePrinter(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(message + " (Printed by " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(500); // Sleeping for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class Illustrate_Thread_Example_for_run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message:");
        String message = scanner.nextLine();

        System.out.println("How many times do you want the message to be printed?");
        int times = scanner.nextInt();

        MessagePrinter printer = new MessagePrinter(message, times);

        // This will create a new thread which will execute the run() method of MessagePrinter
        Thread thread = new Thread(printer);
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Done printing messages.");
    }
}
