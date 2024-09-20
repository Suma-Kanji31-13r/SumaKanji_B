package Threading;
class SimpleThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName()); }}
public class Handle_IllegalThreadStateException {
    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread();
        try { thread.start();
            thread.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught an IllegalThreadStateException. A thread cannot be started more than once."); } }
}
