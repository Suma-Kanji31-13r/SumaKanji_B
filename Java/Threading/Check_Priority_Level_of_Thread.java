package Threading;

public class Check_Priority_Level_of_Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
// This code runs in a new thread
            System.out.println("Running in thread: " + Thread.currentThread().getName());
            System.out.println("Initial Priority: " + Thread.currentThread().getPriority());});
        thread.setName("ExampleThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Main thread new priority: " + Thread.currentThread().getPriority());}
}
