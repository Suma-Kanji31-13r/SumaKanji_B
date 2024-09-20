package Threading;
import java.util.*;
public class Create_Thread_that_Implement_the_Runnable_Interface implements Runnable {
    public void run() {
        System.out.println("The thread is running.");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace(); } } }
    public static void main(String[] args) {
        Runnable runnable = new Create_Thread_that_Implement_the_Runnable_Interface();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("The thread has been started."); }
}
