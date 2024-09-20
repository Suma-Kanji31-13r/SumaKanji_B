package Threading;

public class Use_Join_Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");
        System.out.println("Starting Thread-1");
        thread1.start();
        try {
            System.out.println("Current thread (main) is waiting for Thread-1 to complete");
            thread1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted: " + e.getMessage()); }
        System.out.println("Starting Thread-2");
        thread2.start();
        try {
            System.out.println("Current thread (main) is waiting for Thread-2 to complete");
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted: " + e.getMessage()); }
        System.out.println("Both threads have finished their execution, exiting main thread"); }
    private static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
// Simulating some work with sleep
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage()); }
            System.out.println(Thread.currentThread().getName() + " has finished running"); } }
}
