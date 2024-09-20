package Threading;
import java.util.*;
public class Check_Thread_is_Alive_or_Not extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Check_Thread_is_Alive_or_Not t = new Check_Thread_is_Alive_or_Not();
        System.out.println("Before starting the thread, is alive? " + t.isAlive());
        t.start();
        System.out.println("After starting the thread, is alive? " + t.isAlive());

        // Continuously check if the thread is alive
        while (t.isAlive()) {
            System.out.println("Waiting for the thread to finish...");
            Thread.sleep(500); // Check every half second
        }

        System.out.println("After the thread completed execution, is alive? " + t.isAlive());
    }
}
