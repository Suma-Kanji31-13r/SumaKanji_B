package Threading;
import java.util.*;
class SleepingThread implements Runnable {
    private int sleepTime;

    public SleepingThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("Thread is going to sleep for " + sleepTime + " milliseconds.");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
        System.out.println("Thread has woken up.");
    }
}
public class Suspend_Thread_for_a_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sleep time for the thread in milliseconds:");
        int sleepTime = scanner.nextInt();

        Thread thread = new Thread(new SleepingThread(sleepTime));
        thread.start();

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is stopping.");
    }
}
